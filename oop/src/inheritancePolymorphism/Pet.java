package inheritancePolymorphism;

public class Pet {
	final private String name;
	final private String id;
	


	public Pet(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}		
	
	@Override
	public String toString() {
		return String.format("%s (%s)", getName(), getId());	
	}

	public String says() {
		return "???";
	}
	
	


}
