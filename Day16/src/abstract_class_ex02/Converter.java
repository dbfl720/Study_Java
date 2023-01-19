package abstract_class_ex02;


// 부모 
public abstract class Converter {
	
    abstract protected void printConverted(); // 추상 메소드(필수 구현)// 즉, 자식이 반드시 구현해야하는 메소드.
    
    
    
    // 필드
    protected double ratio; // 비율(환율 또는 1cm의 inch값)
    protected double result; // 결과

    
    
    
    public Converter() {
        // do nothing
    }

    // 생성자
    public Converter(double ratio) {
        this.ratio = ratio;
    }

    
    
    
    // 계산
    public void convert(int input) {
        this.result = input * ratio;
    }
}