
public class Students {
	private int student_id;
	private String fname;
	private String lname;
	private int age;
	private int class_id;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	@Override
	public String toString() {
		return "Students [student_id=" + student_id + ", fname=" + fname + ", lname=" + lname + ", age=" + age
				+ ", class_id=" + class_id + "]";
	}
	
	
}
