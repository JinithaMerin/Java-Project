package Inheritance;

public class Public_access 
{
	protected int a=10;
	protected void display()
	{
		System.out.println("value of a : "+a);
	}

	public static void main(String args[])
	{
		Public_access ob1=new Public_access();
		ob1.display();
	}
}
