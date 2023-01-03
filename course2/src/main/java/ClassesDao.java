import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClassesDao {
	public static Connection getConnection() {
		Connection con = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/administrativeManagmentSystem", "root", "root");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static List<Classes> getAllClasses() {
		List<Classes> list = new ArrayList<Classes>();

		try {
			Connection con = ClassesDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from classes");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Classes c = new Classes();
				c.setClass_id(rs.getInt("class_id"));
				c.setSection(rs.getInt("section"));
				c.setSubject_id(rs.getInt("subject_id"));
				c.setTeacher_id(rs.getInt("teacher_id"));
				list.add(c);

			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static List<Class_info> getAllClassesInfo() {
		List<Class_info> list = new ArrayList<Class_info>();

		try {
			Connection con = ClassesDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from class_info");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Class_info c = new Class_info();
				c.setClass_id(rs.getInt("class_id"));
				c.setSection(rs.getInt("section"));
				c.setSubject_name(rs.getString("subject_name"));
				c.setTime(rs.getString("time"));
				c.setFname(rs.getString("fname"));
				c.setLname(rs.getString("lname"));
				list.add(c);

			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
