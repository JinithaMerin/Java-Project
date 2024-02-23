package polymorphism;

public class Class2 extends Class1 
{
	public void sum(int a,int b)
	{
		//super.sum(3,6);
		int c=a+b;
		System.out.println("Sum of subclass method : "+c);
	}
	
	public void show()
	{
		System.out.println("Subclass method");
	}

	public static void main(String[] args) 
	{
		Class1 ob=new Class2();
		ob.sum(2, 4);
		ob.show();   
		Class1 ob1=new Class1();
		ob1.sum(4, 4);
		// TODO Auto-generated method stub

	}

}
