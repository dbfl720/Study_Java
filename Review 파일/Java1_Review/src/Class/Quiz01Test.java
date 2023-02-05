package Class;

public class Quiz01Test {

	public static void main(String[] args) {
		 // TODO: stu1 객체 생성 및 값 넣기 구현하기

		Quiz01 stu1 = new Quiz01();  // 객체 생성시 클래스명과 같아야 한다!!!
		
		stu1.name = "유재석";
		stu1.age = 21;
		stu1.className = "java";
		stu1.phoneNumber = "01023453223";
	
		
        // 결과값 출력
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.className);
        System.out.println(stu1.phoneNumber);
        stu1.isAdult(21);

        System.out.println();

        
        
        // TODO: stu2 객체 생성 및 값 넣기 구현하기

        Quiz01 stu2 = new Quiz01();
        
        stu2.name = "이효리";
        stu2.age = 17;
        stu2.className = "java";
        stu2.phoneNumber = "01011111134";
        
        
        
        // 결과값 출력
        System.out.println(stu2.name);
        System.out.println(stu2.age);
        System.out.println(stu2.className);
        System.out.println(stu2.phoneNumber);
        stu2.isAdult(17);
	}

	
	
//	// 또는 배열에 넣기
//			Student[] students = new Student[2];
//			students[0] = stu1;
//			students[1] = stu2;
//			
//			// 출력
//			for (int i = 0; i < students.length; i++) {
//				System.out.println(students[i].name);
//				System.out.println(students[i].age);
//				System.out.println(students[i].className);
//				System.out.println(students[i].phoneNumber);
//				students[i].isAdult();
//				System.out.println();
//			}
//	
}
