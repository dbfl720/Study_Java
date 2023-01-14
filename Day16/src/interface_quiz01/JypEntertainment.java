package interface_quiz01;


// 예시 - 나
public class JypEntertainment {

	public void recruitActorAudition(Act act) {  //기획사는  지원자의 연기 능력을 보고 싶어하는 거라서 act를 받아 온 것임. // 결국 부모인 interfacef를 받음.
			// 연기능력(Act)을 본다.
		act.action();
	}

	
	public void recruitIdolAudition(Sing sing) {
		// 노래능력(Sing)을 본다.
		sing.song();		
	}

}
