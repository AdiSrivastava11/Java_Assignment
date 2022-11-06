package abstractexample;

public class AbstractEx {
	public static void main(String[] args) {
		Shape s;
		s = new Square(5);
		meth(s);
//		System.out.println(s.calcArea());
//		System.out.println(s.calcPerimeter());
		
		s = new Rectangle(5,9);
		meth(s);
	}
	public static void meth(Shape s) {
		System.out.println(s.calcArea());
		System.out.println(s.calcPerimeter());
	}
}
