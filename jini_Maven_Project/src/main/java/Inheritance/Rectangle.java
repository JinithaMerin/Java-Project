package Inheritance;


class Rectangle extends Shapes 
{
	public void rectangle_method() 
	{
		System.out.println("Subclass Rectangle method");
		//double area=p*r*r;
	}
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.rectangle_method();
		r.shape_method();
		int area=r.l*r.b;
		System.out.println("area of Rectangle : "+area);
	}
}


