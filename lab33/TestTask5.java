package lab33;
public class TestTask5 {
	public static void main(String[] args) {
		Chocolate c1 = new Chocolate(255, "Snikers");
		Chocolate c2 = new Chocolate(250, "Twix");
		Chocolate c3 = new Chocolate(240,"Mars");
		Chocolate[] chocolates = new Chocolate[] {c1,c3,c2};
		System.out.println("Before:");
		for(Chocolate c : chocolates) {
			System.out.println(c);
		}
		Sort.bubbleSort(chocolates);
		System.out.println("After:");
		for(Chocolate c : chocolates) {
			System.out.println(c);
		}
		Time t1 = new Time(6,30,30);
		Time t2 = new Time(7,35,20);
		Time t3 = new Time(6,35,30);
		Time[] times = new Time[] {t1,t2,t3};
		System.out.println("Before:");
		for(Time t: times) {
			System.out.println(t.toUniversal());
		}
		Sort.mergeSort(times);
		System.out.println("After:");
		for(Time t: times) {
			System.out.println(t.toUniversal());
		}
	}
}
