package Method_ex;

public class Ex02 {

	public static void main(String[] args) {
		// 메소드 만들기
		// 1. 어떤 함수를 만들지 생각하고 메소드명을 짓는다.
		// 2. input을 무엇으로 받을지 생각한다.  - 옵션이다! 꼭 있는 것은 아님
		// 3. output을 무엇으로 돌려줄지 생각한다.
		// 4. 구현
		
		// 나의 의식 - 메소드를 사용하는 곳
		int x = 30;
		int y = 50;
		int result = sum(x, y);  // x, y 전달 인자, 인수 ,Argument
		System.out.println(result);
		System.out.println(sum(x,y));
		
		printHelloWorld();			// 인자값도 없고 결과값도 없다.
		
		// 메소드를 부른다. 메소드를 호출한다. 메소드를 call한다. 메소드를 요청한다.		
				
	}

	// 메소드를 만드는 곳
	// int => return type
	// static (정적). 
	// static 메소드가 다른 메소드를 부르는 경우
	// 메소드에 없으면 참조할 수 없기 때문에 static으로 정의한다.
	
	public static int sum(int a, int b) {  // 위에서 만들어진 sum이 여기서 새로 만들어진 변수에 담아진다. 단, 타입은 일치 시킨다.
										   // a, b => 매개변수, parameter 
										   // input : int a, int b 
		                                   // output : int sum
		int result = a + b;
		return result;   // 한개밖에 못넘긴다.	// ouput : retrun result 어떻게 구현할 것인지..
						// return a + b 로 줄여 쓸 수 있음.					
	}
	
	
	public static void printHelloWorld() {
		System.out.println("Hello world");
		System.out.println("Hello world");
		return;  // 생략 가능. return을 만나면 메소드가 종료된다.
		
	}
}
