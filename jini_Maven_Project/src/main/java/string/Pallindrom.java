package string;

public class Pallindrom 
{
	public void check(String s)
	{
		StringBuffer sb1=new StringBuffer(s);
		StringBuffer s1=sb1.reverse();
		System.out.println(s);
		String st=s1.toString();
		if(s.equalsIgnoreCase(st))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("not Pallindrome");
		}
			
		
	}
	public static void main(String[] args) 
	{
		Pallindrom obj=new Pallindrom();
		obj.check("Java");
		obj.check("MALAYALAM");
	}

}
