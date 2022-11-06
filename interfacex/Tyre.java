package interfaceex;

public class Tyre implements Bounceable{
	
	int factor;
    
    private String color;
    
    public Tyre(String ballcolor) {
        super();
        this.color=ballcolor;
    }

    public String getColor() {
    return color;
    }

    public void setColor(String color) 
    {
       this.color = color;
    }
	
	public void setBounceFactor(int bouncef)
	{
		System.out.println("set bouncefactor "+ bouncef+" for a Tyre");
		this.factor =  bouncef;
		
	}
	public void bounce()
	{
		System.out.println("Tyre is bouncing with a bounce factor ="+ this.factor);
	}

}
