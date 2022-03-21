package test.java;

import org.junit.jupiter.api.Test;

import org.junit.Assert;
import main.java.classes.Animal;

public class AnimalTests {
	
	@Test
	public void createAnimal() {
		
		Animal animal = new Animal("Fred", "3", "3");
		
		Assert.assertEquals("Fred", animal.getName());
		
		// implement species, food
	}
}
