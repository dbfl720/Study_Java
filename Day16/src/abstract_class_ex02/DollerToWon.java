package abstract_class_ex02;


// 자식
public class DollerToWon extends Converter {

	
	// 생성자
	public DollerToWon(double ratio) {
		super.ratio = ratio;
	}
	
	
	
	// 자식클래스에서 출력
	@Override
	protected void printConverted() {
		// 부모가 계산해준 값으로 출력
		System.out.println((int)super.result + "원");
		
	}

}
