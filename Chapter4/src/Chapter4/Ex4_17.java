package Chapter4;

public class Ex4_17 {

	public static void main(String[] args) {
	
		// continue 문
		for(int i = 0; i <= 10; i++) {
			if (i % 3 == 0)
				continue;    // skip한다. 
			System.out.println(i);
		}

	}

}
