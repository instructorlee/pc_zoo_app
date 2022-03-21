package main.java.classes;


public class Animal {
	
	public static int animalCount = 0;
	
	private String name;
	private String species;
	private String food;
	
	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public String getFood() {
		return food;
	}
	
	public Animal(String name, String species, String food) {
		
		this.name = name;
		this.species = species;
		this.food = food;
	}
	
}
