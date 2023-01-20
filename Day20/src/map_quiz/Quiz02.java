package map_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		List<Person> personList = new ArrayList<>();
		
		
		while (true) {
			System.out.println("1:입력 2: 출력 3:삭제 4: 종료");
			int num = scan.nextInt();
			if (num == 1 ) {
				// 입력
				// ** 선생님			
				System.out.print("이름을 입력하세요: ");
				String name = scan.next();
				System.out.print("생년월일을 입력하세요: ");
				int birthDate = scan.nextInt();
				
				// 객체 생성
				Person person = new Person();  // 반복문 안에 넣어야 됨. 사람 생성을 계속 해서..
				person.setName(name);
				person.setbirthDate(birthDate);
				
				System.out.println(personList.add(person) ? "입력 성공 " : "입력 실패");  // 삼항 연산자



				
				
				
			
			} else if (num == 2) {
				// 출력 iterator // 2.출력: 과일이 있으면 출력하고, 아무것도 없을 경우 "비어있습니다." 라고 출력한다.
				

				if (personList.isEmpty()) {
					System.out.println("비어있습니다.");
					continue; 
				}
				Iterator<Person> iter = personList.iterator();
				while (iter.hasNext()) {
					 Person person = iter.next(); // Person person은 클래스 Person을 가리키는 거라 밑에 toString 사용 가능?
					 System.out.println(person.toString()); // toString 생략 가능.  결국 toString()은 객체가 문자로 취급될 때 사용되는 메서드로 객체가 자신의 정체성을 드러내는 하나의 수단입니다.  
				}
				
						
				
				
					
				
			} else if (num == 3) {
				// 삭제
				System.out.println("삭제할 사람의 이름을 입력하세요: ");
				String deleteName = scan.next(); // String 이기 때문에 Person 리스트 못 지움.. 그래서 Iterator 이용.
				
				Iterator<Person> iter = personList.iterator();
				while (iter.hasNext()) {
					Person person = iter.next();
					if (deleteName.equals(person.getName())) {
						iter.remove();  // 가리키는 애를 삭제하기 때문에 이렇게 나둬도 됨.
					}
				}
				System.out.println("삭제했습니다.");
				
				
			} else if (num == 4) {
				// 종료
				System.out.println("종료합니다.");
				break;  // 제일 가까이 있는 반복문을 빠져 나가는 것임.
			} else {
				// 잘못
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	} // main

}