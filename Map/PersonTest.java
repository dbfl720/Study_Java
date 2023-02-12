package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ArrayList 객체를 생성하는 방법
		List<Person> personList = new ArrayList<>();  // new ArrayList<>();에서, <>를 비워두면 왼쪽 List에 지정된 타입을 따라 간다.
		
		
		//무한 루프
		while (true) {
			System.out.println("1: 입력 2: 출력 3: 삭제  4: 종료");
			int num = scan.nextInt();
			
			if (num == 1) {
				// 입력
				System.out.print("이름을 입력하세요: ");
				Person person = new Person();  //Person 객체 생성
				person.setName(scan.next()); // setName안에 파라미터를 scan.next() 해도 됨..
				System.out.print("생년월일을 입력하세요: ");
				person.setYyyymmdd(scan.nextInt());  // setYyyymmdd 파라미터를 scan.nextInt() 해되 됨...
				// List에 넣기.
				boolean isInsert = personList.add(person);
				System.out.println(isInsert ? "입력 성공" : "입력 실패");
				
			} else if (num == 2) {
				// 출력
				if (personList.isEmpty()) {
					System.out.println("비어있습니다.");
					continue; // 다시 반복문에 계속해라.
				}
				
				Iterator<Person> iter = personList.iterator();
				while (iter.hasNext()) {
					Person person = iter.next();
					// System.out.println("이름: " + person.getName() + ", 생년월일: " + person.getYyyymmdd());
					
					// Person의 toString을 오버라이드하면 객체이름만 출력해도 예쁘게 출력된다.
					System.out.println(person.toString());  // !
				}
				
			} else if (num == 3) {
				// 삭제
				System.out.print("삭제할 사람의 이름을 입력하세요: ");
				String deleteName = scan.next();
				Iterator<Person> iter = personList.iterator();
				while (iter.hasNext()) {
					Person person = iter.next();
					if (person.getName().equals(deleteName)) {
						iter.remove();
					}
				}
			} else if (num == 4) {
				//종료
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

}
