package abstractexample;

public class Square extends Shape{
	public Square(int side)
	{
		super(side);
	}
	
	public double calcArea()
	{
		System.out.println("calulating area of square..");
		return this.getSide1() *  this.getSide1();
	}
	
	public double calcPerimeter()
	{
		
		System.out.println("calulating perimeter of square..");
		return this.getSide1() * 4;
	}

}
