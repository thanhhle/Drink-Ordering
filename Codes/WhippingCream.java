
public class WhippingCream extends Topping
{
	public WhippingCream(DrinkInt drink)
	{
		super(drink);
	}
	
	public void makeDrink()
	{
		decoratedDrink.makeDrink();
		System.out.println("Add Whipping Cream");
	}
	
	public String toString()
	{
		return decoratedDrink.toString() + " - Whipping Cream";
	}
	
	public double accept(Visitor visitor)
	{
		return visitor.visit(this);	
	}
}
