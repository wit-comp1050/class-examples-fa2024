package inheritancePolymorphism;

public class Cat2 extends Pet {
	final private boolean hairBalls;

	public Cat2(String name, String id, boolean hairBalls) {
		super(name, id);
		this.hairBalls = hairBalls;
	}

	public boolean hasHairBalls() {
		return hairBalls;
	}
	
	@Override
	public String says() {
		return "Meow";
	}



}
