package abstractexample;

public class Rectangle extends Shape{
	
	public Rectangle(int side1,int side2)
	{
		super(side1,side2);
	}
	
	public double calcArea()
	{
		System.out.println("calulating area of rectangle..");
		return this.getSide1() *  this.getSide2();
	}
	
	public double calcPerimeter()
	{
		System.out.println("calulating perimeter of rectangle..");
		return 2* (this.getSide1() + this.getSide2());
	}
	

}
