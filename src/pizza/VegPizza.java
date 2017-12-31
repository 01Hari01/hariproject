package pizza;

public class VegPizza extends Pizza
{
	private String type;
	private int size;
	boolean result=validate(size,type);
	VegPizza(int size,String type)throws PizzaException
	{
		if(result==true)
		{
			this.size=size;
			this.type=type;
		}
		else 
			throw new PizzaException("no such pizza");
	}
	float calcprice()
	{
		if(size==6&&type.equals("normal"))
		{
			return 50*6;
		}
		if(size==9&&type.equals("supreme"))
		{
			return 100*size;
		}
		if(size==12&&type.equalsIgnoreCase("deluxe"))
		{
			return 150*size;
		}
		else
			return 0.0f;
	}
	

}
