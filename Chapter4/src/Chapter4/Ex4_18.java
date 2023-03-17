package Chapter4;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int menu = 0;
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴 (1~3)를 선택하세요. (종료: 0) : ");
			
			String tmp = scan.nextLine();
			menu = Integer.parseInt(tmp);
			
			
			
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료: 0");
				continue;   //  메뉴 선택 17번으로 다시 반복.
			}
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
		}

	}

}
