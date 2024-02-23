package string;

public class StrinBufferEx 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Java");
		System.out.println(sb.append(" Simple and powerfull"));
		System.out.println(sb.insert(0, "hi"));
		System.out.println(sb.replace(0,4,"python"));
		System.out.println(sb.delete(0,3));
		System.out.println(sb.capacity());

	}

}
