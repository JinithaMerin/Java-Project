package accessSpecifier;

public class Child extends Parent 
{
	int a=20;
	public void show()
	{
		//super.display();
		System.out.println("Child class method");
		System.out.println("Parent variable a: "+super.a);
	}
	
	public Child()
	{
		super.display();
		System.out.println("Child class Constructor");
	}
	public static void main(String[] args) 
	{
		Child ob=new Child();
		ob.show();
		System.out.println(ob.a);
		
		// TODO Auto-generated method stub

	}

}
