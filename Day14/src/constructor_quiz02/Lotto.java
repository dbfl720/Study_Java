package constructor_quiz02;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

//	메소드1: 수동(manual)
//	* 1부터 45까지의 숫자를 수동으로 6개를 입력 받는다.(중복 불가)
//	메소드2: 자동(auto)
//	* 1부터 45까지의 숫자를 중복 없이 자동으로 입력 받는다.
//	
	
	
	
	// 필드
	private int[] number = new int[6];  // 로또에 적힌 숫자 6개
	
	
	
	// 필드를 세팅하는 방법 :   생성자, setter, 일반메소드도 세팅할 수 있음 !!  
	// 메소드1 - 수동 : 직접 마킹한 번호를 입력받는다.
	public void setNumber(int n1, int n2, int n3, int n4, int n5, int n6) {
		this.number[0] = n1;
		this.number[1] = n2;
		this.number[2] = n3;
		this.number[3] = n4;
		this.number[4] = n5;
		this.number[5] = n6;			
	}
	
	
	// 메소드2 - 자동 : 알아서 랜덤으로 6개
	public void setNumber2() {  // setting으로 할 거라서 void
		Random rand = new Random();
		
		// Todo 중복확인! 코드 작성  / 2중 루프
		for (int i = 0; i < this.number.length; i++) {	
			int randNum = rand.nextInt(45) + 1;
			for (int j = 0; j < this.number.length; j++) {
				if (number[i] == number[j]) {
				
					break;
				}			
			}
			}
	}

			
		
//		this.number[0] = rand.nextInt(45) + 1; 
//		this.number[1] = rand.nextInt(45) + 1;
//		this.number[2] = rand.nextInt(45) + 1;
//		this.number[3] = rand.nextInt(45) + 1;		
//		this.number[4] = rand.nextInt(45) + 1;
//		this.number[5] = rand.nextInt(45) + 1;
		
	
	

	
	
	
	
	// getter  // 내가 가진 로또 넘버를 누군가한테 보여주게 하는 것. // 나중에 사용하기 위해.
	public int[] getNumber() {
		return this.number;
	}
	
	
	// getter - 로또 번호 6개 출력  // 그~냥 있는 번호를 출력
	public void printLotto() {  // 출력하고 끝낼 것이기 때문에 void
		System.out.print("로또 종이 숫자 >> ");
		for (int i = 0; i < this.number.length; i++) {  // 0 ~ 5
			System.out.print(this.number[i] + " ");
		}
		System.out.println();
	}
}
