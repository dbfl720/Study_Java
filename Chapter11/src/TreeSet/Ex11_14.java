package TreeSet;

import java.util.TreeSet;

public class Ex11_14 {

	public static void main(String[] args) {
		// TreeSet
		
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		
		System.out.println(set);
		System.out.println("range search : from " + from+ " to " + to);
		System.out.println("result1" + set.subSet(from, to));  // 끝에 글자 포함 안됨.
		System.out.println("result2" + set.subSet(from, to + "zzz"));  // zzz 글자 포함한 부분은 안나옴.
	}

}

//------
//<결과>
//[Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
//range search : from b to d
//result1[bat, car]
//result2[bat, car, dZZZZ, dance, disc]

