package main.java.classes;

import java.util.ArrayList;

public class Zoo {
	
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public ArrayList<Animal> getAnimals() {
		return this.animals;
	}
	
	public Zoo() {}
	
	// what data will be needed if any
	// what data if any will be returned
	// return the list
	public ArrayList<Animal> addAnimal(Animal animal) {
		
		this.animals.add(animal);
		return this.animals;
	}
	
	public boolean removeAnimal(Animal animal) {
		
		return this.animals.remove(animal);
	}
}
