package Inheritance;

public class EmployeeTotal extends EmployeeCalculate
{
	
	double total;
	public void totalCalculate()
	{
		total=basicpay+hra-pf-deduction+bonus;
		System.out.println("total : "+total);
	} 
	public void display()
	{
		System.out.println("	    EMPLOYEE SALARY SLIP	");
		System.out.println("BASIC PAY				: "+basicpay);
		System.out.println("HOUSE RENT ALLOWANCE 			: "+hra);
		System.out.println("PROVIDENT FUND				: "+pf);
		System.out.println("DEDUCTION				: "+deduction);
		System.out.println("BONUS					: "+bonus);
		System.out.println("TOTAL SALARY				: "+total);
	}
	public static void main(String[] args) 
	{
		EmployeeTotal ob=new EmployeeTotal();
		ob.accept();
		ob.calculate();
		ob.totalCalculate();
		ob.display();
		// TODO Auto-generated method stub

	}

}
