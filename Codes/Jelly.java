
public class Jelly extends Topping
{
	public Jelly(DrinkInt drink)
	{
		super(drink);
	}
	
	public void makeDrink()
	{
		decoratedDrink.makeDrink();
		System.out.println("Add jelly");
	}
	
	public String toString()
	{
		return decoratedDrink.toString() + " - Jelly";
	}
	
	public double accept(Visitor visitor)
	{
		return visitor.visit(this);	
	}
}