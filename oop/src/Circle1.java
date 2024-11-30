
public class Circle1 implements Measurable, Comparable<Circle1>{
	
	final private double radius;

	public Circle1(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}

	@Override public double getPerimeter() {
		return 2.*Math.PI*radius;
	}
	
	
	@Override
	public int compareTo(Circle1 o) {
		return Double.compare(this.radius, o.radius);
	}

	

}
