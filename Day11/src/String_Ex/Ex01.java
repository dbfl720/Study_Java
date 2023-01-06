package String_Ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();		// 단어 
		System.out.println(word);
		
		scan.nextLine();  // 남아있는 엔터를 소비 시켜 버린다. 
		
		String text = scan.nextLine();	// 문장(스페이스바 포함)
		System.out.println(text);		
		
	}

}
