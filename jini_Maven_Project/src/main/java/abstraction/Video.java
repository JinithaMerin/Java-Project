package abstraction;

public class Video extends Google
{

	public void search()
	{
		System.out.println("video search");
	}
	public void print()
	{
		System.out.println("show video");
	}
	public static void main(String[] args) 
	{
		Video ob=new Video();
		ob.search();
		ob.print();
		Image ob1=new Image();
		ob1.search();
		ob1.print();
		ob.display();
	}

}
