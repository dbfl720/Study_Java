package interface_ex01;

public class JobTest {

	public static void main(String[] args) {
	 
			// 취준생
			JobApplicant boram = new JobApplicant();
			System.out.println(boram.writeLetter());  // String으로 리턴을 하기 때문에 ,출력을 할려면 System.out~ 이걸로 해야함.. 
			
			
			// 회사에 지원
			Google google = new Google();
			google.recruitJavaDeveloper(boram);  // 자식  // 업캐스팅과 비슷.. 
		}
	}




