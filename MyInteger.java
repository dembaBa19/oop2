package oop2;

public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	//default
	public boolean isOdd() {
		return MyInteger.isOdd(this.value);
	}
	public boolean isEven() {
		return MyInteger.isEven(this.value);
	}
	public boolean isPrime() {
		return MyInteger.isOdd(this.value);
	}
	public boolean equals(int value) {
		return this.value == value;
	}
	
	//
	public static boolean isOdd(int value) {
		return value%2!=0;
	}
	public static boolean isEven(int value) {
		return value%2==0;
	}
	public static boolean isPrime(int value) {
		for(int i=2; i<=(int) Math.sqrt(value); i++) {
			if(value%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//MyInteger
	public static boolean isOdd(MyInteger value) {
		return MyInteger.isOdd(value.getValue());
	}
	public static boolean isEven(MyInteger value) {
		return MyInteger.isEven(value.getValue());
	}
	public static boolean isPrime(MyInteger value) {
		return MyInteger.isPrime(value.getValue());
	}
	public boolean equals(MyInteger value) {
		return this.value == value.getValue();
	}
	
	static int parseInt(char[] array) {
		return MyInteger.parseInt(new String(array));
	}
	static int parseInt(String array) {
		return Integer.parseInt(array);
	}
	
}
