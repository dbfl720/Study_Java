package chapter11_p;

import java.util.HashSet;

public class Ex11_11 {

	public static void main(String[] args) {
		// HashSet 예제3
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);

	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
}




// 중복 허용이 안되는 set메소드를 올바르게 사용하기 위해서는 아래 equals()와 hashCode()를 오버라이딩해야 한다! 

//public boolean equals(Object obj) {
//	if(!(obj instanceof Person)) {
//		return false;
//		
//		Person p = (Person)obj;  // 형변환
//		return name.equals(p.name) && age == p.age;
//	}
//}
//
//public int hashCode() {
//	return Object.hash(name,age);
//}

