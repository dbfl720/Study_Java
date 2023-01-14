package interface_ex01;

// 자식
// 취준생
// implements 와 extends  둘다 사용 가능.
public class JobApplicant implements CProgramming, JavaProgramming {  // 구현을 한다.라는 뜻. // implements는 다중 구현 가능.
		// 필드  spec
	private int toeic;
	private double gradePoint;
	private String[] licenses;
	
	
	// 자소서 메소드
	public String writeLetter() {
		String text = "저는 어디에서 태어나고 어떻게 자랐고....";
		return text;
	}

	
	// 절차지향 프로그래밍 메소드.
	@Override
	public void procedure() {
		System.out.println("C언어는 if문이 있고 for문이 있고 포인터가 있고...");
		
	}


	// 객체지향 프로그래밍 메소드.
	@Override
	public void objectOriented() {
		System.out.println("Java언어는 추상클래스도 있고, 인터페이스가 있고...");
		
	}
	
}
