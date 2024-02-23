package Inheritance;
import java.util.Scanner;
public class Accept 
{
	double basicpay;
	double deduction;
	double bonus;
	
	public void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Basic pay amount : ");
		basicpay=s.nextDouble();
		System.out.println("Enter the Deduction amount : ");
		deduction=s.nextDouble();
		System.out.println("Enter the Bonus amount : ");
		bonus=s.nextDouble();
		// TODO Auto-generated method stub

	}

}
