package preparing;
import java.util.Objects;

public class Building {
	private int numberOfFloors;
	private double floorArea;
	public Building() {
	}
	public Building(int numberOfFloors, double floorArea) {
		this.numberOfFloors = numberOfFloors;
		this.floorArea = floorArea;
	}
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	public void setfloorArea(double floorArea) {
		this.floorArea = floorArea;
	}
	public double getfloorArea() {
		return this.floorArea;
	}
	public int getnumberOfFloors() {
		return this.numberOfFloors;
	}
	public boolean equals(Object o) {
		if(o == this)return true;
		if(!(o instanceof Building))return false;
		Building building = (Building)o;
		return numberOfFloors == building.numberOfFloors && floorArea == building.floorArea;
	}
	public int hashCode() {
		return Objects.hash(numberOfFloors, floorArea);
	}
	public String toString() {
		return "Number of floors: " + this.numberOfFloors + " Floor area " + this.floorArea;
	}
}
