package abstraction;

public class MultipleClass implements MultipleInterface1,MultipleInterface2 
{
	public void display()
	{
		System.out.println("name			: "+name);
		System.out.println("age			: "+age);
	}
	public void show()
	{
		System.out.println("designation		: "+designation);
		System.out.println("salary			: "+sal);
	}
	public static void main(String[] args) 
	{
		MultipleClass ob=new MultipleClass();
		ob.display();
		ob.show();
	}

}
