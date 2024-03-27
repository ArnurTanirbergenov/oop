package lab33;

public class Chocolate implements Comparable<Chocolate>{
	int weight;
	String name;
	public Chocolate() {
		
	}
	
	public Chocolate(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public String toString() {
		return this.name + " " +  this.weight;
	}
	
	public int compareTo(Chocolate c) {
		if(this.weight > c.weight)return 1;
		if(this.weight < c.weight)return -1;
		return 0;
	}
}
