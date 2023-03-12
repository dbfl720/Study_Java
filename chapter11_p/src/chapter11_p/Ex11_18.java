package chapter11_p;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_18 {

	public static void main(String[] args) {
		// HashMap 예제3
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		
		HashMap map = new HashMap();
		
		for(int i = 0; i < data.length; i++) {
			if(map.containsKey(data[i])) { // 키가 포함되어 있는지 알려줌.
				int value = (int)map.get(data[i]); // get(키) :키로 값을 얻어온다!
				map.put(data[i], value +1);  // 기존값에 1을 더해서 저장.
			} else {
				map.put(data[i], 1); // 기존에 없는 키는 값을 1로 저장.
			}
		}
		
		
		Iterator it = map.entrySet().iterator(); // map에서 entrySet() 호출하고 iterator()얻음.
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() + " : " +printBar('#', value) + " " + value);
		}
		
		
		
	} // main




	public static String printBar(char ch, int value) {
		char[] bar = new char[value];  // value는 char배열의 개수
		
		for(int i = 0; i < bar.length; i++)  // value 개수만큼 #증가.
			bar[i] = ch;
			
			return new String(bar); // 문자열을 읽어올 수 있는 String 클래스 
		
		
		
	}
}