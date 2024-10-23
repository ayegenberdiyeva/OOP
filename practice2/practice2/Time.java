package practice2;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("Give integer between 0 and 23.");
		}
		
		if (minute < 0 || minute>=60) {
			throw new IllegalArgumentException("Give integer between 0 and 59.");
		}
		
		if (second < 0 || second>=60) {
			throw new IllegalArgumentException("Give integer between 0 and 59.");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toUniversal() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toStandard() {
		int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
		String period = (hour < 12) ? "AM" : "PM";
		return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
	}
	
	public void add(Time t) {
		this.second += t.second;
		if (this.second >= 60) {
			this.second -= 60;
			this.minute++;
		}
		
		this.minute += t.minute;
		if (this.minute >= 60) {
			this.minute -= 60;
			this.hour++;
		}
		
		this.hour += t.hour;
		if (this.hour >= 24) {
			this.hour -= 24;
		}
	}
	
	public static void main(String[] args) {
		Time time1 = new Time(23, 5, 6);
		System.out.println("Universal Time: " + time1.toUniversal());
		System.out.println("Standard Time: " + time1.toStandard());
		
		Time time2 = new Time(4, 24, 23);
		time1.add(time2);
		
		System.out.println("After Adding Time:\n");
		System.out.println("Universal Time: " + time1.toUniversal());
		System.out.println("Standard Time: " + time1.toStandard());
	}
	
}
