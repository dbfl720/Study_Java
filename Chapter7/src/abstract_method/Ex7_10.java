package abstract_method;

public class Ex7_10 {

	public static void main(String[] args) {
		// 추상 클래스의 작성 예제
		Unit[] group = {new Marine(), new Tank(), new Dropship() };
		
		for(int i = 0; i < group.length; i++) { // Object클래스에는 move메서드가 정의되어 있지 않기 때문에 move메서드를 호출하는데 에러. 
			group[i].move(100,200);
		
		}

	} // main

}


abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { 
//		현재 위치에 정지
	}
}


class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x= " + x + ",y=" + y + "]");
	}
	void stimPack() {
//		스팀팩을 사용한다.
	}
}


class Tank extends Unit {  // 탱크
	void move(int x, int y) {
		System.out.println("Tank[x = " + x + ",y= "+ y + "]");
	}
	void changeMode() { 
		// 공격모드를 변환한다.
	}
}

class Dropship extends Unit {  //송수선
	void move(int x, int y) {
		System.out.println("Dropship[x = " + x + ",y = " + y + "]");
	}
	void load() { // 선택된 대상을 태운다
	
	}
    void unload() {  // 선택된 대상을 내린다.
    	
    }
}