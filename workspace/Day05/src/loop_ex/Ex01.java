package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		//while 반복문을 이용해서 "안녕" 3번 쓰기
		int i = 0; // 카운팅을 위한 변수 i,j,k
		while (i < 3) {		// 0 1 2    3 거짓   //돌리고 싶은 횟수를 쓴다.
			System.out.println("안녕  " + i);
			//i = i + 1;
			//i += 1;    // 복합 대입 연산자    // 여기 세개는 똑같
			++i;		// 	증감 연산자 (전위)
			
			//i++; 		 // 증감 연산자 (후위)   // 이것은 세개와 달름. 사람들이 많이 사 // 출력을 하거나 저장할 때 위험 (바로 저장이 안되기 때문)
			
			
		}
		
		
		
		
		
		// ++i, i++의 차이점
		int number = 1;
		System.out.println("number:" + number);  //결과:1
		System.out.println("++number:" + (++number)); // 결과:2
		System.out.println("number++:" + (number++));  //후위 연산자는 그 줄에서는 머물러 있고, 그 다음줄에서 플러스가 됨.
		System.out.println("number:" + number);  // 결과:3
		
		// 0 ~ 4 => 5
		i = 0;				// 1. 규칙 ( 0으로 시작하면 while문 옆에 끝값을 적는다.)
		while (i < 5) {  // 0 1 2 3 4    5거짓
			System.out.println("딸기 " + i);
			i++;
					
		}
		
		// 1~5 => 5번    (1 -  시작값, 5 - 끝값)
		i = 1;  // 시작값
		while (i  <= 5) {		 // 1 2 3 4 5    6거짓
			System.out.println("마이크 " + i);
			i++;    // 증감 연산을 절대로 빼먹으면 안됨.
		}
		
		
		// 5~ 0 => 6번   5 4 3 2 1 0 
		i = 5;
		while (i >= 0) {		   			// 무조건 시작값이 왼쪽, 끝값은 오른쪽 / 참이 되게 만들어라.
				System.out.println("가방 " + i);		
				i--;
		}
			
		 // 1+2+3+4+5+6+7+8+9+10  합계 구하기
		i = 1;
		int sum = 0;   //  변수의 위치 중요!! while문 밖에 써야한다!!
		while (i <= 10) {
			 sum = sum + i;		// sum += i;
			 i++;
		}
		System.out.println(sum);	
	}

}
