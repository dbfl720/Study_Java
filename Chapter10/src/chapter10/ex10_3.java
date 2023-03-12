package chapter10;

import java.util.Calendar;

public class ex10_3 {

	public static void main(String[] args) {
		// Calendar - time
		final int[] TIME_UNIT = {3600, 60, 1};  //큰 단위를 앞에 놓는다. 
		final String[] TIME_UNIT_NAME = {"시간", "분", "초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10); // time1을 10시 20분 30초로 설정
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20); // time2을 20시 30분 10초로 설정
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
				
		
		
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "시 "+ time1.get(Calendar.MINUTE) + "분 "+ time1.get(Calendar.SECOND) + "초");
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "시 "+ time2.get(Calendar.MINUTE) + "분 "+ time2.get(Calendar.SECOND) + "초");
		
		
	
	}

}
