package chapter11_p;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

	public static void main(String[] args) {
		// HashMap 예제1
		
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");  //이미 존재하는 키 추가 가능. 기존 값은 없어짐
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id :");
			String id = scan.nextLine().trim(); // trim : 앞 , 뒤 공백 제거
			
			System.out.print("password : ");
			String password = scan.nextLine().trim();
			System.out.println();
			
			
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} 
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		} // while

	}

}