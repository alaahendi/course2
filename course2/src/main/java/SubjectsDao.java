import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SubjectsDao {
	public static Connection getConnection() {
		Connection con = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager
					.getConnection("jdbc:mysql://localhost/administrativeManagmentSystem" , "root","root");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static List<Subjects> getAllSubjects() {
		List<Subjects> list = new ArrayList<Subjects>();

		try {
			Connection con = SubjectsDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from subjects");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Subjects s = new Subjects();
				s.setSubject_id(rs.getInt(1));
				s.setSubject_name(rs.getString(2));
				list.add(s);
				
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
