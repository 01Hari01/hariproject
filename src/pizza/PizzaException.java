package pizza;

public class PizzaException extends Exception
{
	String str;
	public PizzaException(String str)
	{
		this.str=str;
		System.out.println(str);
	}

}
