package chapter11_p;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {

	public static void main(String[] args) {
		// HashSet 예제4
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = " + setA);
		
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = " + setB);

		
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp)) {  // 교집합
				setKyo.add(tmp);
			}
		}
		
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) { // 차집합
				setCha.add(tmp);
			}
		}
		
		
		it = setA.iterator();
		while(it.hasNext()) {  //합집합
			setHab.add(it.next());
			
		}
		
		
		it = setB.iterator();
		while(it.hasNext()) {  //합집합
			setHab.add(it.next());
		}
		
		
		
		System.out.println("A와 B의 교집합 = " + setKyo);
		System.out.println("A와 B의 합집합 = " + setHab);
		System.out.println("A와 B의 차집합 = " + setCha);
	}

}


//
//--------
//A = [1, 2, 3, 4, 5]
//B = [4, 5, 6, 7, 8]
//A와 B의 교집합 = [4, 5]
//A와 B의 합집합 = [1, 2, 3, 4, 5, 6, 7, 8]
//A와 B의 차집합 = [1, 2, 3]