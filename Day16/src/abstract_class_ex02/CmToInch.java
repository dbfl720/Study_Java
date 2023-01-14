package abstract_class_ex02;

public class CmToInch extends Converter{

	// 생성자
	public CmToInch() {
		// 비율은 변함없기 때문에 내부에서 세팅해준다.
		super.ratio = 0.393701;			// a to b 검색.
				
	}
	
	// 자식이 출력
	@Override
	protected void printConverted() {
		System.out.println(this.result + "inch");
		
	}

}
