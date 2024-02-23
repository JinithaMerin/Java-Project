package accessSpecifier;
import java.util.Scanner;
public class DivisibleBy10 extends Addition
{
	public void check(int a,int b)
	{
		int c=super.add(a,b);
		if(c%10==0)
		{
			System.out.println("Divisible by 10");
		}
		else
		{
			System.out.println("Not Divisible by 10");
		}
	}
	
	public static void main(String args[])
	{
		DivisibleBy10 ob= new DivisibleBy10();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		ob.check(a,b);
	}
}
