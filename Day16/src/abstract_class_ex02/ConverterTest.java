package abstract_class_ex02;

public class ConverterTest {

	public static void main(String[] args) {
        Converter d2w = new DollerToWon(1234); // 환율 검색하기
        d2w.convert(10000); // input 값 , 부모가 계산
        d2w.printConverted();   // 자식이 출력

        Converter c2i = new CmToInch(); // cm -> inch 비율 검색하기
        c2i.convert(20); // input 값
        c2i.printConverted();
    }

}
