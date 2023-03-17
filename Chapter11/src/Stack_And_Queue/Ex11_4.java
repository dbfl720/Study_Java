package Stack_And_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {

		// Stack과 Queue의 활용 예제2
		static Queue q = new LinkedList();  //Queue가 인터페이스라서 LinkedList 객체 생성 사용.
		static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장
		
		
		public static void main(String[] args) {
			System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
			
			while(true) {
				System.out.println(">>");
				try {
					// 화면으로부터 라인단위로 입력받는다.
					Scanner s = new Scanner(System.in);
					String input = s.nextLine().trim(); // 공백 삭제.
					
					if("".equals(input))
						continue;
					
					if(input.equalsIgnoreCase("q")) {
						System.exit(0);
					} else if (input.equalsIgnoreCase("help")) {
						System.out.println(" help - 도움말을 보여줍니다.");
						System.out.println("q 또는 Q - 프로그램을 종료합니다.");
						System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
					} else if (input.equalsIgnoreCase("history")) {
						
						save(input);  // 입력받은 명령어를 저장.
						
						LinkedList list = (LinkedList)q;
						final int SIZE = list.size();
						for (int i = 0; i < SIZE; i++) 
							System.out.println((i+1) + "." + list.get(i));
						} else { 
							save(input);
							System.out.println(input);
						}
						
					} catch(Exception e) {
						System.out.println("입력오류입니다.");
					}						
			
	} // while

} // main
			
			public static void save(String input) {
				if (!"".equals(input)) {
					q.offer(input);  // queue에 저장한다.
				}
				
				// queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
				if(q.size() > MAX_SIZE) {  // size()는 Collection인터페이스의 정의
					q.remove();  // 꺼내서 반환.
				}
			}
}
		
			
			
			
