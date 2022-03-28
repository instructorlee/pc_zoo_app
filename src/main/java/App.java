package main.java;

import main.java.classes.Animal;
import main.java.classes.Comm;
import main.java.classes.Zoo;

public class App {
	
	private static Comm comm = new Comm();
	
	
	public static void main(String[] args) {
		
		boolean active = true;
		String[] parts;
		Zoo zoo = new Zoo();

		zoo.addAnimal(new Animal("Polly", "parrot", "leaves"));
		zoo.addAnimal(new Animal("Leo", "lion", "people"));
		zoo.addAnimal(new Animal("Marvin", "monkey", "fruit"));
		zoo.addAnimal(new Animal("Flo", "flamingo", "shrimp and algae"));
		
		while(active) {
			parts = comm.getRequest("Prompt:");
			
			if ( parts[0] != null) {
				
				switch(parts[0]) {
				
					case "list":
						// add code here to list all the animals
						break;
				
					case "quit":
						active = false;
						break;
					
					default:
						comm.outputLine("invalid request");
				}
			}
		}
		
		comm.outputLine("Good Bye!");
	}
}
