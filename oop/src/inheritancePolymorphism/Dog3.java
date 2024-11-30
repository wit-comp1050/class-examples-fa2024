package inheritancePolymorphism;

public class Dog3 extends Pet3{

	public Dog3(String name, String id) {
		super(name, id);
	}
	
	@Override
	public String says() {
		return "Woof";
	}

}
