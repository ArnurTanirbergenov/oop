package lab3;
import java.util.Vector;
public class DragonLaunch {
	private Vector<Person> prisoners;
	{
		prisoners = new Vector<>();
	}
	public void kidnap(Person person) {
		prisoners.add(person);
	}
	public boolean willDragonEatOrNot() {
	    int i = 0;
	    while (i < prisoners.size() - 1) {
	        String currentGender = prisoners.get(i).toString();
	        String nextGender = prisoners.get(i + 1).toString();

	        if (currentGender.equals("BOY") && nextGender.equals("GIRL")) {
	            prisoners.remove(i);     
	            prisoners.remove(i);    
	            i = 0;                   
	        } else {
	            i++;                    
	        }
	    }

	    return prisoners.isEmpty();
	}
}
