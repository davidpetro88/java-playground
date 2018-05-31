package academy.learnprogramming.main;

import academy.learnprogramming.models.Person;
import academy.learnprogramming.models.Address;

import com.google.gson.*;
import java.util.List;

public class Main {
    public static void main(String [] args) {

    	Person p1 = new Person("S0123", "Frank", 18);
    	Person p2 = new Person("S0456", "James", 28);

 		p1.addAddress(new Address("123 Main Street", "Miami", "FL"));
 		p1.addAddress(new Address("45 Maple Drive", "Ft. Lauderdale", "FL"));

 		p2.addAddress(new Address("45 Madison Avenue", "New York", "NY"));

		List<Person> persons = List.of(p1,p2);
    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
    	String jsonStr = gson.toJson(persons);
    	System.out.println(jsonStr);
  }
}

