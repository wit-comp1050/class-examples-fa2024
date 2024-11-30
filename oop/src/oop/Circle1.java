package oop;

public class Circle1 {
	
	private double radius = 1.0;
	
	public Circle1() {
		this(3.5);
	}
	
	public Circle1(double r) {
		setRadius(r);
	}
	
	public Circle1(double r, double c) {
		setRadius(r);
	}
	
	

////
	 double getRadius() {
		return radius;
	}
	
//
	public void setRadius(double radius) {
		if (radius>0) {
			this.radius = radius;
		}
	}
//
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	
	public static void main(String[] args) {
		Circle1 c1 = new Circle1(5);
		Circle1 c2 = new Circle1(10);
		Circle1 c3 = new Circle1(5);
		Circle1 c4 = new Circle1();
		Circle1 c5 = new Circle1();
		c5 = null;
		
		System.out.println(c1);
		System.out.println(c5);
		System.out.println(c2.getRadius());
		System.out.println(c2.getArea());
		//System.out.println(c5.getRadius());
	}

	

}
