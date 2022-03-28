package test.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.classes.Animal;
import main.java.classes.Zoo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


public class ZooTests {
	
	public Zoo zoo;
	
	@BeforeEach
	public void setUp() {
		this.zoo = new Zoo();
	}
	
	@Test
	public void addAnimalTests() {
		
		ArrayList<Animal> animals = this.zoo.addAnimal(new Animal("a", "b", "c"));
		
		assertEquals(animals.size(), 1);
	}
	
	@Test
	public void removeAnimalTests() {
		// how can you set up the test?
		
		this.zoo.addAnimal(new Animal("a", "b", "c"));
		
		Animal targetAnimal = new Animal("target", "target", "target");
		this.zoo.addAnimal(targetAnimal);
		
		// test if existing animal is removed
		boolean result = this.zoo.removeAnimal(targetAnimal);
		
		assertTrue(result);
		
		// test if non-existent animal is removed
		assertFalse(this.zoo.removeAnimal(new Animal("b", "b", "b")));
		
		// was the animal actually removed?
		assertFalse(this.zoo.getAnimals().contains(targetAnimal));
		
	}
}
