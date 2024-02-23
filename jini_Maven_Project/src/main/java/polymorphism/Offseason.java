package polymorphism;
import java.util.*;
public class Offseason extends Onseason 
{
	static double discount;
	public void discount(double cost)
	{
		double discount=0.15*cost;
		System.out.println("Offseason discount price : "+discount);
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the prize of the cloth  :");
		double cost=s.nextDouble();
		Offseason ob1=new Offseason();
		ob1.discount(cost);
		Onseason ob2=new Onseason();
		ob2.discount(cost);
		// TODO Auto-generated method stub

	}
}
