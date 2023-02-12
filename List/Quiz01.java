package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
		// 리스트가 제공하는 함수 사용하기

		//1.
		List<Integer> list = new ArrayList<>(Arrays.asList(3,8,9,4,2,1,7,5));
		System.out.println(list);
		
		// 2.
		list.set(4, 6);
		System.out.println(list);
		
		
		//3.
//		Iterator<Integer> iter = list.iterator();
//		while(iter.hasNext()) {
//			Integer number = iter.next();
//			System.out.println(number);
//			
//			if(number == 8) {
//				iter.remove();
//			}
//			
//			if(number == 7) {
//				iter.remove();
//			}
//		}
//		System.out.println(list);
		
		
		list.remove(1);
		System.out.println(list);
		list.remove(5);
		System.out.println(list);
		
		
		
	}

}
