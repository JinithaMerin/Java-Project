package encapsulation;

public class Encapsulation 
{
	private String name;
	private int acc_no;
	private String address;
	
	public void setter(String name,int acc_no,String address)
	{
		this.name=name;
		this.acc_no=acc_no;
		this.address=address;
	}
	public void getter()
	{
		System.out.println("Name  		: "+name);
		System.out.println("Account no	: "+acc_no);
		System.out.println("Address		: "+address);
	}
	

}
