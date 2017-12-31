package pizza;

public class PizzaOnline 
{
	float totalSales;
	public float order(Pizza p)
	{
		return p.calcprice();
	}
	float getTotalSales()
	{
		return totalSales;
	}
	public static void main(String arg[])throws PizzaException
	{
		PizzaOnline po=new PizzaOnline();
		VegPizza vp=new VegPizza(9,"supreme");
		NonVegPizza nv=new NonVegPizza(6,"normal");
		float price=po.order(vp);
		System.out.println(price);
		price=po.order(nv);
		System.out.println(price);
		
	}
	

}
