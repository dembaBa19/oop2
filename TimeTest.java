package oop2;

public class TimeTest {

	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println(time1.convertToString());
		Time time2 = new Time(555550000);
		System.out.println(time2.convertToString());
		Time time3 = new Time (5, 23, 55);
		System.out.println(time3.convertToString());
	}

}