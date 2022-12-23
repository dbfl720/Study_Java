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

