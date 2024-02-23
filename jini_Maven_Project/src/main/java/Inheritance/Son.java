package Inheritance;

public class Son extends Father
{
	int age=29;
	public void son_display()
	{
		System.out.println("son Subclass method");
	}
	public static void main(String[] args) 
	{
		Son s=new Son();
		System.out.println(s.age);
		s.son_display();
		s.grand_display();
		s.father_display();
	}

}
