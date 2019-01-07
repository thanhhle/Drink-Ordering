
public class Boba extends Topping
{
	public Boba(DrinkInt drink)
	{
		super(drink);
	}
	
	public void makeDrink()
	{
		decoratedDrink.makeDrink();
		System.out.println("Add boba");
	}
	
	public String toString()
	{
		return decoratedDrink.toString() + " - Boba";
	}
	
	public double accept(Visitor visitor)
	{
		return visitor.visit(this);	
	}
}
