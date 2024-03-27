package lab2;

public class Student {
	private int id;
	String name;
	int studyYear;
	public Student(int studyYear) {
		this.studyYear = studyYear;
	}
	public int incStudyYear() {
		this.studyYear++;
		return this.studyYear;
	}
	public Student() {
		id++;
	}
	public Student(int studyYear, String name) {
		this();
		this.studyYear = studyYear;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return this.getId() + " " + this.name + " " + this.studyYear;
	}
}
