package chap07_home_01;

import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

import chap06_3_2.C;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("---------");		
		
		
		
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
		
	} 
//	animalSound(new Dog());
//	animalSound(new Cat());
}
