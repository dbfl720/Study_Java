package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {
		// 반복문으로 리스트 접근하기
		
		//1.
		List<Integer> list = new ArrayList<>(Arrays.asList(20,3,5,84,17));
		System.out.println(list);

		
		//2.
		int min = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(min > list.get(i)) {
				min = list.get(i);
			}
			
					
		} System.out.println(min);
		
		
		
		//3.
		int sum = 0;
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			
			sum += iter.next();
		}
		System.out.println("합은 : " + sum);
				
	} // main

}
