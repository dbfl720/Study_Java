package List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Quiz03 {

	

	
	
	public static void main(String[] args) {
		//1.
		
		List<Integer> average = new ArrayList<>();
		average.add(8);
		average.add(7);
		average.add(6);
		average.add(10);
		average.add(9);
		average.add(4);
		
		System.out.println(average);
		
		
		average.sort(Comparator.naturalOrder()); // 오름차순 정렬하기
		System.out.println(average);
		average.remove(0); // 최소값 삭제
		average.remove(average.size() - 1);  // 맨 마지막 index ****
		
		System.out.println(average);
		
		
		// 반복문으로 리스트 접근해서 값 빼내오기.
		int sum = 0;
		for(int i = 0; i < average.size(); i++) {  // size()
			System.out.println(average.get(i));   // get()
			sum += average.get(i);
			
		}
		System.out.println((double)sum / average.size());
		

	}

}
