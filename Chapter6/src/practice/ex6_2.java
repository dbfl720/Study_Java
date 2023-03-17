package practice;

public class ex6_2 {

		// 6-1
		
		public static void main(String[] args) {
			Student s = new Student("홍길동", 1, 1, 100, 60, 76);
			
			String str = s.info();
			System.out.println(str);
			
			
	}
}


	class Student {
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		
		Student(String a, int b, int c, int d, int e, int f) {
			this.name = a;
			this.ban = b;
			this.no = c;
			this.kor = d;
			this.eng = e;
			this.math = f;
		}
		
		
		
		public String info(){
			return name + "," + ban+ ","+ no + "," + kor  +"," + eng + "," + math + "," + (kor + eng + math) + 
					"," + ((double)((kor + eng+ math) / 3));
		}
}
