package preparing;
import java.util.Set;
import java.util.HashSet;
public class testBuilding {
	public static void main(String args[]) {
		Set<Building> buildings = new HashSet<>();
		
		Building b1 = new Building(5, 123.5);
		OfficeBuilding b2 = new OfficeBuilding(10, 321.4, 4);
		OfficeBuilding copyb2 = new OfficeBuilding(10, 321.4, 4);
		Building copyb1 = new Building(5, 123.5);
		
		buildings.add(copyb1);
		buildings.add(b1);
		buildings.add(b2);
		buildings.add(copyb2);
		
		for(Building building : buildings) {
			System.out.println(building.toString());
		}
	}
}
