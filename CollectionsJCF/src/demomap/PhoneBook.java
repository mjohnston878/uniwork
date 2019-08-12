package demomap;

import java.util.HashMap;
import java.util.Map;


public class PhoneBook {

	public static void main(String[] args) {

		
		Map<Integer, Contacts> phoneNumbers = new HashMap<>();
		
		Contacts c1 = new Contacts();
		c1.setFname("Aidan");
		c1.setLname("McG");
		c1.setEmail("aidan@qub.ac.uk");
		
		Contacts c2 = new Contacts("Matt", "Johnston", "matt@qub.ac.uk");
		
		phoneNumbers.put(1, c1);
		phoneNumbers.put(2, c2);
		
		phoneNumbers.put(3, new Contacts("Niamh", "McG", "niamh@qub.ac.uk"));
		
		Contacts c3 = phoneNumbers.get(3);
		System.out.println(c3.toString());
		
		for(Integer key : phoneNumbers.keySet()) {
			System.out.println(key +" " + phoneNumbers.get(key).getFname() + " " + phoneNumbers.get(key).getEmail());
			
			
		}
		
        System.out.println("\033[33m YELLOW");
 
	}
	
	

}
