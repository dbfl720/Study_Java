package chapter10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ex10_9 {

	public static void main(String[] args) {
		// SimpleDateFormat
		
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2019년 11월 23일"); // parse(String source)는 SimpleDateFormat의 조상인 DateFormat에 정의되어 있다. // 예외처리가 필요하다.
			System.out.println(df2.format(d));
		} catch(Exception e) {}

	}

}
