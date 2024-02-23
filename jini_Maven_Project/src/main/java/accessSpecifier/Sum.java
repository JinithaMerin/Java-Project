package accessSpecifier;

public class Sum 
{
	public String name(String name)
	{
		return name;
	}

	public static void main(String[] args) 
	{
		Sum s=new Sum();
		System.out.println(s.name("jinitha"));
	}

}
