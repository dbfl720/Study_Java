package polymorphism_quiz01;

public class AnimalTest {

	public static void main(String[] args) {
	Animal[] animals = new Animal[2];
	animals[0] = new Cat();
	animals[1] = new Dog();
	
	
	// up casting : 자식 -> 부모
	animals[0].cry();
	animals[0].cry();
	animals[0].cry();
	animals[1].cry();
	animals[1].cry();
	animals[1].cry();
	
	
	// down casting : 부모 -> 자식
	if (animals[0] instanceof Cat) {
		Cat cat = (Cat)animals[0];
		cat.grooming();
	} if (animals[1] instanceof Dog) {
		Dog dog = (Dog)animals[1];
		dog.lash();
	}

	
	
	}

}
