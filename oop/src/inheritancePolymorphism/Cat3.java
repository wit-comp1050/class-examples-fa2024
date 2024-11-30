package inheritancePolymorphism;

public class Cat3 extends Pet3{
	
	final private boolean hairBalls;

	public Cat3(String name, String id, boolean hairBalls) {
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
