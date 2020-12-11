package oop2;

public class MyIntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger number1 = new MyInteger(22);
		System.out.println(MyInteger.isEven(number1));
		number1.setValue(13);
		System.out.println(MyInteger.isOdd(number1));
		number1.setValue(9);
		System.out.println(MyInteger.isPrime(number1));
		number1.setValue(19);
		System.out.println(number1.equals(18));
	}

}
