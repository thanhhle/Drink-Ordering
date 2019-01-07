

public class PriceVisitor implements Visitor
{
	// Milk Tea = 3.50
	// Juice = 3.25
	// Smoothie = 4.25
	// Boba = 0.5
	// Jelly = 0.25
	// WhippingCream = 0.5
	public double visit(DrinkInt drink)
	{
		double totalPrice = 0.0;
		if(drink instanceof MilkTea)				totalPrice = 3.50;
		else if(drink instanceof Juice)				totalPrice = 3.25;
		else if(drink instanceof Smoothie)			totalPrice = 4.25;
		
		if(drink instanceof Boba)					totalPrice += 0.5;
		else if(drink instanceof Jelly)				totalPrice += 0.25;
		else if(drink instanceof WhippingCream)		totalPrice += 0.5;

		return totalPrice;
	}
}