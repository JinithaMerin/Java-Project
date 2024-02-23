package abstraction;

public class SampleClass implements SampleInterface
{
	public void show()
	{
		System.out.println("abstract show method");
	}
	public void print()
	{
		System.out.println("abstract print method");
	}
	public static void main(String[] args) 
	{
		SampleInterface ob=new SampleClass();
		ob.show();
		ob.print();
	}

}
