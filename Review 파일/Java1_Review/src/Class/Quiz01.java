package Class;

public class Quiz01 {

		// Class 정의와 사용

//		학생 명단
//		학생 Class를 설계하세요.
//		멤버 변수(필드)는 아래를 참조하세요.
//
//		이름, 수업명, 나이, 전화번호
//
//		메소드는 아래를 참조하세요.
//
//		나이가 20세 이상이면 "OOO(이름)은 성인입니다."
//		나이가 20세 미만이면 "OOO(이름)은 미성년자입니다."
//
//		2개의 객체를 생성하고, 각각의 값 출력과 메소드를 호출해서 출력하세요.

	
	
		// 필드
		String name;
		String className;
		int age;
		String phoneNumber;
		
		
		// 메소드
		void isAdult(int age) {
			if(age >= 20) {
			System.out.println("나이가 20세 이상이면 " + this.name + "은 성인입니다.");
			} else {
				System.out.println("나이가 20세 미만이면 " + this.name + "은 미성년자입니다.");
			}
		}
		
		
		
		
	

}
