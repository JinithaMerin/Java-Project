package string;

public class StringPallinFor 
{
	public static void main(String[] args) 
	{
		String s="malayalam";
		String rev="";
		int l=s.length();
		for(int i=(l-1);i>=0;i--)
		{
			char c=s.charAt(i);
			rev=rev+c;
		}
		System.out.println("reverse of the string is : "+rev);
		if(s.equals(rev))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");	
		}
	} 

}
