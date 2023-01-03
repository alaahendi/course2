
public class Class_info {
	private int class_id; 
	private int section; 
	private String time;
	private String fname;
	private String lname; 
	private String subject_name;
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
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
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	@Override
	public String toString() {
		return "class_info [class_id=" + class_id + ", section=" + section + ", time=" + time + ", fname=" + fname
				+ ", lname=" + lname + ", subject_name=" + subject_name + "]";
	}
	
}
