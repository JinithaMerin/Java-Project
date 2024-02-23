package Inheritance;
class Triangle extends Shapes
{
	public void triangle_method() 
	{
		System.out.println("Subclass Triangle method ");
		
	}
	public static void main(String[] args) 
	{
		Triangle t=new Triangle();
		t.triangle_method();
		t.shape_method();
		double area=3.14*t.r*t.r;
		System.out.println("area of Triangle : "+area);
		// TODO Auto-generated method stub

	}

}
