package Inheritance_quiz01;

public class HealthRate extends HealthInfo{


//부모 클래스(HeathInfo.java)를 상속받는 비만도 계산 클래스를 설계한다.(HealthRate.java)

//출력 예시 (HealthTest.java)
//박둘리님의 신장 160, 몸무게 45kg => 정상입니다.
//홍길동님의 신장 168, 몸무게 90kg => 비만입니다.

	public HealthRate(String name, int height, int weight) {   // 부모 생성자에서 기본생성자가 없어서, 파라미터가 있는 생성자가 있어야함.
		// 생성자를 만들지 않으면 파라미터가 없는 기본생성자가 만들어진다.
		// 내가 생성자(파라미터가 있는)를 만들면 기본 생성자가 만들어 지지 않는다.
		
		// 상속을 받는 자식클래스의 객체를 생성할 때 부모생성자가 먼저 호출되고 
		// 자식 생성자가 그 다음에 호출된다. ex) 응애 , 학생입니다.
		// 임의로 부모생성자를 불러주지 않으면, 부모의 기본생성자를 호출하려고 시도한다.
		// 그런데 없었기 때문에, 에러가 발생했고, 
		// 3개의 파라미터가 있는 부모생성자를 임의로 호출했다.
		super(name, height, weight);
		
	}

	
	// 표준 체중 메소드   // input: x    output: 표준체중 (double)
	 public double sw() {
//	    표준체중:SW=(H-100)*0.9
		return (super.height - 100) * 0.9;
		
    }
	

	 

     //비만도: B(%)=(W-SW)/SW * 100   // input: x  , output: double
	 public double getRate() {	  // 같은 클래스 내에서 메소드 사용 가능.
		 return (super.height - sw()) / sw() * 100;
		 
	 }
		 

	 
	 
	 // 비만 여부 메소드   // input: x    //output : String
	 //(비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만)
	 private String status() {     // !! 메소드도 private 할 수 있다!!   // 그대신에 클래스 내부에서만 사용 가능.
		 double rate = getRate();
		 if (rate < 10) { // 10 미만
			 return "정상";
		 } else if (rate < 20) {  // 10 ~ 20미만 
			 return "과체중";
		 } else { // 20이상
		    return "비만";
		 }
 		}
	 
	 @Override
	 public void showInfo() {
		 super.showInfo();
		 System.out.println("=> " + status());
	 }
	 
	 
	 
	 }
	

