package Inheritance;

public class Square extends Shapes
{
	public void square_method() 
	{
		System.out.println("Subclass Square method");
	}

	public static void main(String[] args) 
	{
		Square s=new Square();
		s.square_method();
		s.shape_method();
		int area=s.side*s.side;
		System.out.println("area of Square : "+area);
	}
}
