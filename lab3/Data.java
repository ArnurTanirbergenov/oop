package lab3;

public class Data {
	private double max = 0;
	private double sum = 0;
	private int counter = 0;
	public void addNumber(double number) {
		sum += number;
		if(max < number) {
			max = number;
		}
		counter++;
	}
	public double  getAverage() {
		if(counter == 0)return 0;
		else return sum / counter;
	}
	public double getMax() {
		return max;
	}
	
}
