package Inheritance;

public class Baby extends Dog
{
	String baby="pupi";
	public void babymethod()
	{
		System.out.println("sub2 class method");
	}


public static void main(String[] args) 
{
	Baby ob=new Baby();
	ob.animalmethod();
	ob.dogmethod();
	ob.babymethod();
	System.out.println("parent dog name "+ob.animal);
	System.out.println("sub parent"+ob.dog);
	System.out.println("puppi "+ob.baby);
	
	// TODO Auto-generated method stub

}
}
