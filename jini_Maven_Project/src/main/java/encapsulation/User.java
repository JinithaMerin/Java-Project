package encapsulation;
import java.util.*;
public class User 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the pin");
		int pin=s.nextInt();
		Bank obj=new Bank();
		obj.setter(pin);
		obj.validate(pin);
		obj.getter();
		
	}

}
