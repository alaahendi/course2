
public class Teachers {
private int teacher_id;
private String fname;
private String lname;
private String major;
public int getTeacher_id() {
	return teacher_id;
}
public void setTeacher_id(int teacher_id) {
	this.teacher_id = teacher_id;
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
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
@Override
public String toString() {
	return "Teachers [teacher_id=" + teacher_id + ", fname=" + fname + ", lname=" + lname + ", major=" + major + "]";
}

}
