package oop2;

public class Time {
	private int hour, minute, second;
	
	public Time() {
		setTime(System.currentTimeMillis());
	}
	public Time (long miliseconds){
		setTime(miliseconds);
	}
	public Time (int newHour, int newMinute, int newSecond){
		setHour(newHour);
		setMinute(newMinute);
		setSecond(newSecond);
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void setTime(long miliseconds) {
		long milisecondsToday = miliseconds % (1000L * 60 * 60 * 24);
		hour = (int) (milisecondsToday / (1000L * 60 * 60));
		minute = (int) ((milisecondsToday % (1000L * 60 *  60)) / (1000 * 60));
		second = (int) ((milisecondsToday % (1000L * 60)) / 1000);
	}
	public String convertToString() {
		return "Hour : " + hour + ", Minutes : " + minute + ", Seconds : " + second;
	}
	
}