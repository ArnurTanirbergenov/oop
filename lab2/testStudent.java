package lab2;

public class testStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Arnur";
		s.studyYear = 2203;
		Student s2 = new Student(1, "Arnur3");
		
		System.out.println(s);
		System.out.println(s2.toString());
		System.out.println(s2.incStudyYear());
		System.out.println(s.getName());
		System.out.println(s.getId());
	}

}
