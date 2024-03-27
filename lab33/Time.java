package lab33;

public class Time implements Comparable<Time>{
	public int hour;
	public int minute;
	public int second;
	
	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	public void setTime(int hour, int minute, int second) {
		if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		else throw new IllegalArgumentException("Invalid input");
	}
	public String toUniversal() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	public String toStandard() {
		String period = "";
		if(hour <= 12) {
			period = "AM";
		}
		else period = "PM";
		int standardHour = 0;
		if(hour == 0 || hour == 12) {
			standardHour = 12;
		}
		else standardHour = hour % 12;
		return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
	}
	public void add(Time secondtime) {
		int newHour = this.hour + secondtime.hour;
		int newMinute = this.minute + secondtime.minute;
		int newSecond = this.second + secondtime.second;
		if(newSecond > 60) {
			newMinute++;
			newSecond -= 60;
		}
		if(newMinute > 60) {
			newHour++;
			newMinute -= 60;
		}
		if(newHour > 24) {
			newHour %= 24;
		}
		this.hour = newHour;
		this.minute = newMinute;
		this.second = newSecond;
	}
	public int compareTo(Time t) {
		if(this.hour > t.hour)return 1;
		if(this.hour < t.hour) return -1;
		if(this.minute > t.minute)return 1;
		if(this.minute < t.minute)return -1;
		if(this.second > t.second)return 1;
		if(this.second < t.second)return -1;
		return 0;
	}
}
