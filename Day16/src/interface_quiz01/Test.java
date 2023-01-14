package interface_quiz01;

public class Test {

	public static void main(String[] args) {
	    // 지원자
	    Applicant yuri = new Applicant();
	   

	    // 지원할 곳 (JYP)
	    JypEntertainment jyp = new JypEntertainment();
	    jyp.recruitActorAudition(yuri); // 여기서 나를 통체로 넘기면 받는 쪽에서는 interface로 받는다.
	    jyp.recruitIdolAudition(yuri);

	}

}




