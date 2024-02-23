package aggregation;

public class Student 
{
	String name;
	int age;
	Address a;
	
	public Student(String name,int age,Address a)
	{
		this.name=name;
		this.age=age;
		this.a=a;
	}
	public void display()
	{
		System.out.println("Name 		: "+name);
		System.out.println("Age 	 	: "+age);
		System.out.println("House name 	: "+a.h_name);
		System.out.println("House no. 	: "+a.h_no);
		System.out.println("Pincode 	: "+a.pin);
		System.out.println("City 		: "+a.city);	
	}
	
	public static void main(String args[])
	{
		Address ob1=new Address("Kuriappilly",222,683594,"Ernakulam");
		Student ob2=new Student("Jinitha",30,ob1);
		ob2.display();
	}
}
