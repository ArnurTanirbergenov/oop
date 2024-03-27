package lab33;
import java.util.Date;
import java.lang.Comparable;
public class Employee extends Person implements Cloneable, Comparable<Employee> {
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	public Employee() {
		
	}
	public Employee(String name, int age, String surname, double salary, Date hireDate, String insuranceNumber) {
		super(name, age, surname);
		this.salary = salary;
		this.insuranceNumber = insuranceNumber;
		this.hireDate = hireDate;
	}
	
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super.setName(name);
		this.salary = salary;
		this.insuranceNumber = insuranceNumber;
		this.hireDate = hireDate; 
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public double getSalary() {
		return salary;
	}
	public Date getDate() {
		return hireDate;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public String toString() {
		return super.toString() + " Salary: " + this.salary + " Hire date: " + this.hireDate + " Insurance number " + this.insuranceNumber;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o))return false;
		Employee e = (Employee)o;
		return this.hireDate.equals(e.hireDate) && this.insuranceNumber.equals(e.insuranceNumber) && this.salary == e.salary;
	}
	public Object clone() throws CloneNotSupportedException{
		Employee e = (Employee)super.clone();
		e.hireDate = (Date)this.hireDate.clone();
		return e;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.salary > o.salary)return 1;
		if(this.salary < o.salary) return -1;
		return 0;
	}
}
