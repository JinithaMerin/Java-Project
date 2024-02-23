package encapsulation;
import java.util.*;
public class Bank 
{
	private int pin;
	private int bal=10000;
	private int amount;
	public void setter(int pin)
	{
		this.pin=pin;
	}
	public void withdraw()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount you need to withdraw");
		amount=s.nextInt();
		bal=bal-amount;
		System.out.println("Successfully withdrawed");
		System.out.println("Available balance : "+bal);
		
	}
	public void validate(int pin)
	{
		if((pin==1001)|(pin==1234)|(pin==1212))
		{
			System.out.println("Valid Pin number");
			withdraw();
		}
		else
		{
			System.out.println("Invalid Pin number");
		}
	}
	public void getter()
	{
		System.out.println("Pin number of the user : "+pin);
	}

}
