package Inheritance;

public class Daughter extends Father
{
	public void daughter_display()
	{
		System.out.println("daughter Subclass method");
	}
	public static void main(String[] args) 
	{
		Daughter d=new Daughter();
		System.out.println(d.age);
		d.daughter_display();
		d.grand_display();
		d.father_display();
	}

}
