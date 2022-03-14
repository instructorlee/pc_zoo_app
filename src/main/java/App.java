package main.java;

import main.java.classes.Comm;

public class App {
	
	private static Comm comm = new Comm();
	
	public static void main(String[] args) {
		
		boolean active = true;
		String[] parts;
		
		while(active) {
			parts = comm.getRequest("Prompt:");
			
			if ( parts[0] != null) {
				
				switch(parts[0]) {
				
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
