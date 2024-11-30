package inheritancePolymorphism;

 abstract public class Pet3 {
	final private String name;
	final private String id;
	


	public Pet3(String name, String id) {
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

	abstract public String says();

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pet3) {
			final Pet3 p = (Pet3) obj;
			return this.id.equals(p.id);
		} else {	
			return false;
		}
	}


}
