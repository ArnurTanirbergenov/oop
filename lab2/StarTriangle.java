package lab2;

public class StarTriangle {
	private int widht;
	public StarTriangle(int widht) {
		this.widht = widht;
	}
	public String toString() {
		String result = "";
		for(int i = 0; i < widht; i++) {
			for(int j = 0; j <= i; j++) {
				result += "[*]";
			}
			result += "\n";
		}
		return result;
	}
}
