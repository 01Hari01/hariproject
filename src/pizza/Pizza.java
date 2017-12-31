package pizza;

public abstract class Pizza 
{
	String type;
	int size;
	abstract float calcprice();
	public boolean validate(int size,String type)
	{
		if((size==6||size==9||size==12)&&(type.equals("supreme")||type.equals("deluxe")||type.equals("normal")))
				{
			     return true;
			
				}
		else
		{
			
		    return false;
		}
	}

}
