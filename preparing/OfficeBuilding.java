package preparing;

import java.util.Objects;

public class OfficeBuilding extends Building {
	private int numberOfOffices;
	public OfficeBuilding() {
		
	}
	public OfficeBuilding(int numberOfFloors, double floorArea, int numberOfOffices) {
		super(numberOfFloors, floorArea);
		this.numberOfOffices = numberOfOffices;
	}
	public void setNumberOfOffices(int numberOfOffices) {
		this.numberOfOffices = numberOfOffices;
	}
	public int getNumberofOffices() {
		return numberOfOffices;
	}
	public boolean equals(Object o) {
		if(o == this)return true;
		if(!(o instanceof OfficeBuilding)) return false;
		OfficeBuilding office = (OfficeBuilding)o;
		return super.equals(o) && this.numberOfOffices == office.numberOfOffices;
	}
	public int hashCode() {
		return Objects.hash(super.hashCode(), numberOfOffices);
	}
}
