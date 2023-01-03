import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TeachersDao {
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

	public static List<Teachers> getAllTeachers() {
		List<Teachers> list = new ArrayList<Teachers>();

		try {
			Connection con = TeachersDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from teachers");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Teachers t = new Teachers();
				t.setTeacher_id(rs.getInt(1));
				t.setFname(rs.getString(2));
				t.setLname(rs.getString(3));
				t.setMajor(rs.getString(4));
				list.add(t);
				
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
