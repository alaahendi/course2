
public class Classes {
private int class_id;
private int section;
private int teacher_id;
private int subject_id;
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
public int getTeacher_id() {
	return teacher_id;
}
public void setTeacher_id(int teacher_id) {
	this.teacher_id = teacher_id;
}
public int getSubject_id() {
	return subject_id;
}
public void setSubject_id(int subject_id) {
	this.subject_id = subject_id;
}
@Override
public String toString() {
	return "Classes [class_id=" + class_id + ", section=" + section + ", teacher_id=" + teacher_id + ", subject_id="
			+ subject_id + "]";
}

}
