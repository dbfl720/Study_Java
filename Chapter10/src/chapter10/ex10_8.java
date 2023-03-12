package chapter10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex10_8 {

	public static void main(String[] args) {
		// SimpleDateFormat
		Date today = new Date();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd"); // 월은 대문자 MM
		sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); // h(1~12) H(0~23)
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); //a - 오전/오후
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째주입니다.");
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번재 주입니다.");
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		

		System.out.println(sdf1.format(today));  // format(Date d)
		System.out.println(sdf2.format(today)); 
		System.out.println(sdf3.format(today)); 
		System.out.println(sdf4.format(today)); 
		System.out.println(); 
		System.out.println(sdf5.format(today)); 
		System.out.println(sdf6.format(today)); 
		System.out.println(sdf7.format(today)); 
		System.out.println(sdf8.format(today)); 
		System.out.println(sdf9.format(today)); 
	}

}
