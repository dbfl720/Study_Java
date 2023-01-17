# Study_Java_객체 비교(equals()

- By 혼자 공부하는 자바 (Chanpter 11-1, 객체 비교(equals()) 
- public boolean equals(Object obj) {…}
- 자바에서는 두 객체를 동등 비교할 때 equals() 메소드를 흔히 사용합니다. equals() 메소드는 두 객체를 비교해서 논리적으로 동등하면 true를 리턴하고, 그렇지 않으면 false를 리턴합니다.
- 논리적으로 동등하다는 것은 같은 객체이건 다른 객체이건 상관없이 객체가 저장하고 있는 데이터가 동일함을 뜻합니다.





# Study_Java_객체 문자 정보(toString())

- toString() 메소드는 객체의 문자 정보를 리턴합니다. 객체의 문자 정보란 객체의 문자열을 표현한 값을 말합니다.
- Object 클래스의 toString() 메소드는 '클래스이름 @16진수해시코드'로 구성된 문자 정보를 리턴합니다. 
- Object 하위 클래스는 toString() 메소드를 재정의(오버라이딩)하여 간결하고 유익한 정보를 리턴하도록 되어 있습니다.


# 변수의 타입

- 변수의 타입은 참조형과 8개의 기본형이 있다.
- 숫자 (정수 : byte, short, int, long  / 실수 : float, double)
- 문자 (char, String)
- 논리 (boolean)


# 문자열 결합

- 숫자 뿐만 아니라 두 문자열을 하칠 때도 덧셈을 사용할 수 있다.
- String name = "Ja" + "va";
- String str = name + 8.0;



# 기본형의 종류와 범위
![993908415A96665E19](https://user-images.githubusercontent.com/116433637/209466751-5766f16d-39d5-440e-9c64-e6fe964749ab.jpeg)


# 화면으로부터 입력 받기
1. import java.util.Scanner;   //Scanner 클래스를 사용하기 위해 추가
2. Scanner scanner = new Scanner(System.in);   // Scanner 클래스의 객체를 생성
3. String input = scanner.nextline();
   int num = Integer.parseInt(input);  // Intege.parseInt()메서드를 이용해서 문자열을 int 타입의 정수로 변환
   
   int num = scanner.nextInt();  // 정수를 입력받아서 변수 num에 저장
   
   
   
   
# if - else 문
- if (조건식) {
         // 조건식1의 연산결과가 참일 때 수행될 문장들을 적는다.
- } else if (조건식2) {
         // 조건식2의 연산결과가 참일 때 수행될 문장들을 적는다.
- } else if (조건식3) {
         // 조건식3의 연산결과가 참일 때 수행될 문장들을 적는다.
- } else {  // 마지막은 보통 else블럭으로 끝나며, else 블럭은 생략가능하다.
      // 위의 어느 조건식도 만족하지 않을 때 수행될 문장들을 적는다.
- }



# for문
- for (초기화;조건식;증감식) {
-  // 조건식이 참(true)인 동안 수행될 문장들을 적는다.
-   }
   
   ![다운로드](https://user-images.githubusercontent.com/116433637/210136590-80993c47-ed6c-442f-b9b0-acd1007cb01f.jpeg)




# 2차원 배열(2 Demensional Array)
- 배열 안에 배열이 자리 잡은 형태로 2차원 배열 이라고 한다.
- 2차원 배열은 여러개의 1차원 배열을 가진 배열이다.
- 첫 번째 범위는 저장 할 1차원 배열의 개수를 의미한다
- 두 번째 범위는 저장 한 1차원배열의 크기를 의미한다.
- 1차원 배열의 크기는 모두 동일해야 한다.


![스크린샷 2023-01-08 오후 9 05 45](https://user-images.githubusercontent.com/116433637/211195478-11f27927-f68b-4cf9-964b-deb4062c0e89.png)




# 인터페이스(Interface)
- 메소드는 구현할 수 없으며, 인터페이스를 구현(상속)하는 클래스에서 메소드를 반드시 구현해야 한다.
- implements 키워드를 사용하여 구현(상속)
- 다중 구현 가능
- 인터페이스로 객체를 만들 수 없다. 자식 클래스만 객체 생성 가능.



# 콜렉션(Collection) 자료구조와 리스트(List) 리스트(List) 자료구조
- 배열처럼 같은 자료형의 묶음 자료구조
- 기본 자료형 타입은 저장할 수 없고, 객체만 담을 수 있다.
- 크기가 고정되어 있지 않고, 동적으로 할당된다.
- 중간에 있는 값을 빼내면 앞으로 당겨진다.(메모리 낭비 없음)
- 타입 안정성을 보장하는 generic을 쓸 수 있다.
- ist<Integer> numbers = new ArrayList<>();
- 위의 코드는 List에 Integer 타입의 값들만 넣을 수 있다.
