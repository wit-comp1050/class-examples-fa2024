package inheritancePolymorphism;

public class Sub extends Super{
	
	public static void m2() {
		System.out.printf("Sub.m2()%n");
	}

	public static void main(String[] args) {
		Super.m1();
		Super.m2();
		Sub.m1();
		Sub.m2();
	}


}
