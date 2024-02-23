package abstraction;

public class SampleDemo extends Sample
{
	public void show()
	{
		System.out.println("abstract method implementation");
	}
	public static void main(String[] args) 
	{
		SampleDemo ob=new SampleDemo();
		ob.show();
		ob.display();
	}

}
