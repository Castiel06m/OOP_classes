package pr2;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Hour must be 0-23");
		}
		if (minute < 0 || minute > 59) {
			throw new IllegalArgumentException("Minute must be 0-59");
		}
		if (second < 0 || second > 59) {
			throw new IllegalArgumentException("Second must be 0-59");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toStandard() {
		
		int hourS = hour % 12;
		if (hourS == 0) hourS = 12;
		
		String AmOrPm = (hour < 12) ? "AM" : "PM";
		
		return String.format("%02d:%02d:%02d %s", hourS, minute, second, AmOrPm);
	}
	
	public String toUniversal() {
		
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	
	public void add(Time other) {
		int addSec = this.second + other.second;
		this.second = addSec % 60;
		
		int addMin = this.minute + other.minute;
		this.minute = addMin % 60;
		
		int addHour = this.hour + other.hour;
		this.hour = addHour % 24;
	}
}
