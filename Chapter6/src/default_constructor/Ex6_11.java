package default_constructor;

public class Ex6_11 {

	public static void main(String[] args) {
		// default constructor
		
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();  // compile error 발생.  -> new Data_2(10)으로 바꾸면 됨. 매개변수가 있는 생성자 호출로..
		//The constructor Data_2() is undefined
	}

}
