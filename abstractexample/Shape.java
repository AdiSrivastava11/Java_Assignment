package abstractexample;

public abstract class Shape {
	
	private int side1,side2,side3;

	public Shape()
	{
		
	}
	
	public Shape(int side1) {
	
		this.side1 = this.side2 = this.side3 = side1;
	}


	public Shape(int side1, int side2) {
		
		this.side1 = side1;
		this.side2 = side2;
	}

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	@Override
	public String toString() {
		return "Shape [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}
	
	public abstract double calcArea();
	
	public abstract double calcPerimeter();
	
}
