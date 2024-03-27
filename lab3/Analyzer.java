package lab3;
import java.util.Scanner;
public class Analyzer {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Data data = new Data();
		while(true) {
			System.out.println("Write a number ");
			if(input.hasNextDouble()) {
				double number = input.nextDouble();
				data.addNumber(number);
			}
			else {
				String value = input.next();
				if(value.equals("Q")) {
					break;
				}
			}
		}
		System.out.println("Your average is:" + data.getAverage());
		System.out.println("Your max is:"  + data.getMax());
	}
}
