package lab33;
import java.util.Date;
import java.util.Collections;
import java.util.Vector;
public class TestLab3 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Date hiredate1 = new Date();
		Employee e1 = new Employee("A", 18, "Tanirbergenov", 12345.678, hiredate1, "22B030448");
		System.out.println(e1.toString());
		Employee e2 = new Employee("B", 18, "Tanirbergenov", 12345.678, hiredate1, "22B030448");
		System.out.println(e1.equals(e2));
		Employee e3 = new Employee("C", 18, "Tanirbergenov", 22345.678, hiredate1, "22B030448");
		System.out.println(e3.compareTo(e1));
		Employee e4 = (Employee) e3.clone();

		Vector<Employee> employees = new Vector<>();
		employees.add(e4);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		System.out.println("Before:");
		for(Employee e: employees) {
			System.out.println(e.toString());
		}
		Collections.sort(employees, new NameComparator());
		System.out.println("After");
		for(Employee e: employees) {
			System.out.println(e.toString());
		}
		Date hiredate2 = new Date();
		Manager m1 = new Manager("Manager1", 25, "Surname1", 3333.33, hiredate2, "213321fdfd", 100);
		Manager m2 = (Manager) m1.clone();
		Manager m3 = new Manager("Manager2", 25, "Surname2", 3333.33, hiredate2, "213321fdfd", 105);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1.equals(m2));
		System.out.println(m3.compareTo(m1));
		m1.addEmployee(e4);
		m1.addEmployee(e3);
		System.out.println(m1.getEmployees());
	}
}
