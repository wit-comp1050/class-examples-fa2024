package inheritancePolymorphism;

public class TestPets {

	public static void main(String[] args) {
		Cat2 c = new Cat2("Mittens", "5432", true);
		System.out.printf("%s%n", c);
		System.out.printf("%b%n", c.hasHairBalls());
		System.out.println(c.says());
		
		Dog2 d = new Dog2("Love", "1234");
		System.out.printf("%s%n", d);
		System.out.println(d.says());
		
		
		Cat3 c3 = new Cat3("Jay", "123", false);
		Cat3 c4 = new Cat3("Micky", "234", false);
		Cat3 c5 = new Cat3("Garfield", "456", true);
		
		Cat3[] cats = {
				new Cat3("Jay", "123", false),
				new Cat3("Micky", "234", false),
				new Cat3("Garfield", "456", true)
		};
		
		Dog3[] dogs = {
				new Dog3("Sandy", "111"),
				new Dog3("Mako", "222"),
				new Dog3("Clifford", "444")
		};
		

//
		for(Cat3 cat: cats) {
			System.out.printf("%s says '%s'", cat, cat.says());
			if (cat.hasHairBalls()) {
				System.out.printf(" :: CLEARS THROAT ::");
			}
			System.out.printf("%n");
		}
		
		for(Dog3 dog: dogs) {
			System.out.printf("%s says '%s'", dog, dog.says());
			System.out.printf("%n");
		}
		
		Object o = "foo";
		
		String s = (String) o;
		
//		System.out.println(o instanceof Object );// true
//		System.out.println(o instanceof String );// true
//		
//		System.out.println(o instanceof Double ); // false
//
//		System.out.println(d instanceof Object ); //true

		Pet3[] pets = {
				new Dog3("Spot", "1234"),
				new Dog3("Rover", "6789"),
				new Cat3("Mittens", "5432", true),	
				new Cat3("Garfield", "8765", false)
			};

			for (Pet3 p : pets) {
				System.out.printf("%s says '%s'", p, p.says());
				
				if (p instanceof Cat3) {
					final Cat3 ca = (Cat3) p;
					if (c.hasHairBalls()) {	
						System.out.printf(" :: CLEARS THROAT ::");
					}
				}
				
				System.out.printf("%n");
			}
			
			
			
//			
			final Dog3 d1 = new Dog3("d1", "1");
			final Dog3 d2 = new Dog3("d2", "2");
			final Dog3 lost = new Dog3("?", "1");				
			System.out.printf("%b%n", 	d1.equals(d2));
			System.out.printf("%b%n", 	d1.equals(lost));
			System.out.printf("%b%n", 	d2.equals(lost));


			
		
		
	}
}
