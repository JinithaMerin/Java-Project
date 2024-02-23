package Inheritance;

public class EmployeeCalculate extends Accept
{
	
	double hra,pf;
	public void calculate()
	{
		hra=0.05*basicpay;
		pf=0.20*basicpay;
	}
}
