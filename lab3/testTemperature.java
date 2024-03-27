package lab3;

public class testTemperature {
	public static void main(String args[]) {
		Temperature temperature = new Temperature(32.0, "C");
		System.out.println(temperature.toString());
		System.out.println(temperature.getFahrenheit());
		temperature.setDegree(5);
		temperature.setScale("F");
		System.out.println(temperature.toString());
		temperature.setTemperature(273, "F");
		System.out.println(temperature.getCelsius());
	}
}
