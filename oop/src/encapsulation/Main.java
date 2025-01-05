package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		Prdouct prdouct;
//		try {
//			prdouct = new Prdouct();
//			prdouct.setName("WAjahat");
//			prdouct.setPrice(200);
//			System.out.println(prdouct.getName());
//			System.out.println(prdouct.getPrice());
//		} catch (IllegalAccessException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//		
//	}
//		Vehicle car=new Vehicle("1gdjhdh5ghdh");
//		System.out.println("Vehicle VIN"+car.getVin());
//		System.out.println("Initial speed"+car.getSpeed());
//		car.setSpeed(200);
//		System.out.println("updated speed:"+ car.getSpeed());
		List<String> hobbie=new ArrayList<String>();
		hobbie.add("Reading");
		hobbie.add("Cycling");
		ImmutablePerson person=new ImmutablePerson("Wajahat", 20, hobbie);
		System.out.println("Name: "+person.getName());
		System.out.println("Age: "+person.getAge());
		System.out.println("Hobbies: "+person.getHobbies());
		hobbie.add("Swimming");
		 System.out.println("After modifying original list:");
	     System.out.println("Hobbies (Person): " + person.getHobbies());
	     List<String> personHobbies = person.getHobbies();
	        personHobbies.add("Painting"); // Modifies the returned copy
	        System.out.println("After modifying returned list:");
	        System.out.println("Hobbies (Person): " + person.getHobbies());
	        ImmutablePerson perso=new ImmutablePerson("ajahat", 20, hobbie);
	        System.out.println("Name: "+perso.getName());
			System.out.println("Age: "+perso.getAge());
			System.out.println("Hobbies: "+perso.getHobbies());

}
}