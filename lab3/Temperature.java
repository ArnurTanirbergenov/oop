package lab3;

public class Temperature {
	private double degree;
	private String scale;
	{
		this.degree = 0;
	}
	{
		this.scale = "C";
	}
	{
		this.degree = 0;
		this.scale = "C";
	}
	
	public Temperature(double degree, String scale) {
		this.degree = degree;
		this.scale = scale;
	}
	
	public double getCelsius() {
		if(scale.equals("C")) {
			return degree;
		}
		else {
			return (9 *(degree/5) + 32);
		}
	}
	
	public double getFahrenheit() {
		if(scale.equals("F")) {
			return degree;
		}
		else {
			return (5 * (degree - 32) / 9);
		}
	}
	
	public void setDegree(double degree) {
		this.degree = degree;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getScale() {
		return scale;
	}
	public void setTemperature(double degree, String scale) {
		this.degree = degree;
		this.scale = scale;
	}
	public String toString() {
		return "Temperature " + degree + scale;
	}
	
}
