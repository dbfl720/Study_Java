package polymorphism_ex01;

public class AnimalTest {

	public static void main(String[] args) {
		// Animal animal = new Animal();
		
		int number = (int)2.5;  // casting 문법
		
		// up casting : 자식 -> 부모 캐스팅
		// 1. 부모클래스의 메소드를 사용할 수 있다.
		// 2. 부모클래스에 있는 메소드를 오버라이드 한 메소드로 사용할 수 있다.
		// 3. 자식클래스에만 있는 메소드는 사용할 수 없다.
		Animal animal = (Animal)new Cat();  // casting 문법 생략 가능. // 부모쪽으로 casting 때만..  부모가 한명 밖에 없어서... 
		animal.eat();  //1.
		animal.cry();  //2.
		//animal.grooming(); //3. 사용 불가
		
		
		
		// down casting : 부모 -> 자식 캐스팅
		// 1. 자식클래스가 여러개이기 때문에 명확하게 캐스팅 문법을 명시해주어야 한다.
		// - 어떤 자식클래스인지 instanceof 명령어를 사용해서 검사해야 한다.   
		// down casting은 잘 안쓰이지만, 만약 쓰이는 경우 꼭 instanceof를 검사해야한다.!
		if (animal instanceof Cat) { // animal이 cat에서 태어났어? 
			Cat cat = (Cat)animal;  // 1. (Cat) 캐스팅 문법 생략 불가. - 자식이 여려명 이기 때문에. 정확하게 태어난 Cat에서 바꿀 수 있다.
			cat.cry();
			cat.eat();
			cat.grooming();
			
		} else if (animal instanceof Dog) {  // animal이 dog에서 태어났어? 
			Dog dog = (Dog)animal;
			dog.cry();
			dog.eat();
			dog.lash();
		}
		
	}
	
	   // 컴파일 에러(빨간줄 에러 - 무조건 고쳐야 하는 에러),런타임 에러(수행 했을 때 알 수 있는 에러)
	

}
