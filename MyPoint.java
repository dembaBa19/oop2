package oop2;

public class MyPoint {
	private double x;
	private double y;
	
	//default
	public MyPoint(){
		x=y=0;
	}
	//set x and y
	MyPoint(double x, double y){
		setX(x);
		setY(y);
	}
	
	//min and max functions
	static double max(double a, double b) {
		if(a>b) return a;
		else return b;
	}
	static double min(double a, double b) {
		if(a<b) return a;
		else return b;
	}
	static double square(double number) {
		return number*number;
	}
	
	double distance (MyPoint p) {
		return this.distance(p.getX(), p.getY());
	}
	double distance (double x, double y) {
		return Math.sqrt(square(this.x-x)+square(this.y-y));
	}
	double distance (MyPoint a, MyPoint b) {
		return a.distance(b.x, b.y);
	}
	
	//getters and setters
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
		
}