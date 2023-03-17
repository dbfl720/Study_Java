package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {

	public static void main(String[] args) {
		// Iterator
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator(); // 1회용이라 다 쓰고 나면 다시 얻어와야 한다.
		
		while(it.hasNext()) {  // 읽어올 요소가 있는 확인
			Object obj = it.next(); // 다음 요소를 읽어옴
			System.out.println(obj);
		}

	}

}
