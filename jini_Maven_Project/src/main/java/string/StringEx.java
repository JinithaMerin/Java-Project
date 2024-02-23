package string;

public class StringEx 
{

	public static void main(String[] args) 
	{
		String s="Welcome";
		String s1=new String(" JINITHA ");
		String s2="welcome";
		String s3="   Hi my name is jinitha   ";
		System.out.println(s.concat(s1));				//Welcome Jinitha 
		System.out.println(s.equals(s2));				//false
		System.out.println(s.equals(s2));				//false
		System.out.println(s.equalsIgnoreCase(s2));  	//true
		System.out.println(1+2+"jini"+3+4);				//3jini34
		System.out.println(s.length());					//7
		System.out.println(s.toUpperCase());			//WELCOME
		System.out.println(s1.toLowerCase());			// jinitha
		System.out.println(s3.trim());					//Hi my name is jinitha
		System.out.println(s.startsWith("co"));			//false
		System.out.println(s2.startsWith("we"));		//true
		System.out.println(s.replace('W','m'));			//melcome
		boolean bol=true;
		System.out.println(String.valueOf(bol));		//true

		
		//StringBuffer sb=new StringBuffer("java");
		

		
	}

}
