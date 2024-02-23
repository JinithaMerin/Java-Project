package Inheritance;

public class Car extends VehicleEx {
	
	int b=12;
	public void carMethod()
	{
		System.out.println("Child class method "+a);
		
	}

	public static void main(String[] args) 
	{
		Car ob=new Car();
		ob.carMethod();
		ob.method1();
		System.out.println("value of a= "+ob.a);
		System.out.println("value of b= "+ob.b);
		
		// TODO Auto-generated method stub

	}

}
