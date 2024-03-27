package lab33;
import java.util.Comparator;
public class HireDateComparator implements Comparator<Employee>{


	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDate().compareTo(o2.getDate());
	}
	
}
