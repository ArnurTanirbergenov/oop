package lab33;

import java.util.Date;
import java.util.Vector;
public class Manager extends Employee{
	private int bonus;
	public Vector<Employee> team = new Vector<>();
	public Manager() {
		
	}
	public Manager(String name, int age, String surname, double salary, Date hireDate, String insuranceNumber, int bonus) {
		super(name, age, surname, salary, hireDate, insuranceNumber);
		this.bonus = bonus;
	}
	
	public void addEmployee(Employee e) {
		team.add(e);
	}
	
	public Vector<Employee> getEmployees() {
		return team;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public String toString() {
		return super.toString() + " Bonus: "  + this.bonus;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o))return false;
		Manager m = (Manager)o;
		return this.bonus == m.bonus;
	}
	public int compareTo(Manager c) {
		int temp = super.compareTo(c);
		if(temp == 0) {
			if(this.bonus > c.bonus) return 1;
			if(this.bonus < c.bonus) return -1;
			if(this.bonus == c.bonus) return 0;
		}
		return temp;
	}
	public Object clone() throws CloneNotSupportedException{
		Manager m = (Manager)super.clone();
		return m;
		
	}
}
