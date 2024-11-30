package inheritancePolymorphism;

public class Dog2 extends Pet{
	
	public Dog2(String name, String id) {
		super(name, id);
	}
	
	@Override
	public String says() {
		return "Woof";
	}
}
