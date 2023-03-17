package chapter10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ex10_10 {

	public static void main(String[] args) {
		// SimpleDateFormat
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		System.out.println("날짜를 " + pattern +  "의 형태를 입력해주세요(ex- 2019/12/31)");
		
		while(s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("날짜를 "+ pattern + "의 형태로 다시 입력해주세요.");
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()/(60*60*1000));
		System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
	}

}
