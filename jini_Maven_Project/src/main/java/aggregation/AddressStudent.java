package aggregation;
public class AddressStudent 
{
	String h_name;
	int h_no;
	String city;
	int pin;
	StudentDetail sd;
	
		public AddressStudent(StudentDetail sd,String h_name,int h_no,String city,int pin)
		{
			this.sd=sd;
			this.h_name=h_name;
			this.h_no=h_no;
			this.pin=pin;
			this.city=city;
		}
	
	
	public void display()
	{
		System.out.println("Student Name 			: "+sd.name);
		System.out.println("Roll no 	 		: "+sd.r_no);
		System.out.println("House name 			: "+h_name);
		System.out.println("House no. 			: "+h_no);
		System.out.println("City 				: "+city);
		System.out.println("Pincode 			: "+pin);
	}
	
	public static void main(String[] args) 
	{
		StudentDetail ob1=new StudentDetail("Jinitha",101);
		AddressStudent ob2=new AddressStudent(ob1,"Kuriappilly house",222,"ernakulam",683594);
		ob2.display();
	}

}
