package Collections;

	import static java.util.Collection.*;  // Collections 생략가능하게 해줌.
	import java.util.*;

	public class Ex11_19 {

		public static void main(String[] args) {
			// Collections 예제
			List list = new ArrayList();
			System.out.println(list);

			addAll(list,1,2,3,4,5);
			System.out.println(list);
			
			
			rotate(list, 2);  // 오른쪽으로 두 칸씩 이동
			System.out.println(list);
			
			
			swap(list, 0, 2);  //첫 번째와 세번 째를 교환(swap)
			System.out.println(list);
			
			shuffle(list);   // 저장된 요소으 ㅣ위치를 임의로 변경
			System.out.println(list);
			
			sort(list, reverseOrder());  // 역순 정렬 reverse(list); 와 동일
			System.out.println(list);
			
			int idx = binarySearch(list, 3);  //3이 저장된 위치(index)를 반환
			System.out.println("index of 3 = " + idx);
			
			
			fill(list, 9); // list를 9로 채운다.
			System.out.println("list = " + list);
			
			// list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
			List newList = nCopies(list.size(), 2);
			System.out.println("newList = " + newList);
			
			System.out.println(disjoint(list, newList)); // 공통요소가 없으면 true
			
			copy(list, newList);   // newList를 list에 복사
			System.out.println("newlist = " + newList);
			System.out.println("list = " + list);
			
			
			
			replaceAll(list, 2, 1);
			System.out.println("list = " + list);
			
			Enumeration e = enumeration(list);
			ArrayList list2 = list(e);
			
			System.out.println("list2 = "+ list2);
		}//main


}
