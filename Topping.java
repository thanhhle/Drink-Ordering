
public abstract class Topping implements DrinkInt
{
	protected DrinkInt decoratedDrink;
	
	public Topping(DrinkInt decoratedDrink)
	{
		this.decoratedDrink = decoratedDrink;
	}
	
	public void makeDrink()
	{
		decoratedDrink.makeDrink();
	}
	
	public abstract double accept(Visitor visitor);
}
