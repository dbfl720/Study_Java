package polymorphism_quiz02;

public class ShapeTest {

	public static void main(String[] args) {
        Shape[] shape = new Shape[3];  

        // upcasting    자식 -> 부모
        shape[0] = new Triangle(8, 10); // 밑변, 높이   //new Triangle(8, 10);   -  자식의 생성자.
        shape[1] = new Rectangle(7, 13); // 가로, 세로  // new Rectangle(7, 13);  - 자식의 생성자.
        shape[2] = new Circle(12); // 반지름  // new Circle(12) - 자식의 생성자.

        for (int i = 0; i < shape.length; i++) {
            shape[i].printArea();
        }
    }
} 