import java.util.List;

public class DrinksAndPrice 
{
	private List<DrinkInt> drinkList;
	private double totalPrice;
	
	public DrinksAndPrice(List<DrinkInt> drinkList, double totalPrice)
	{
		this.drinkList = drinkList;
		this.totalPrice = totalPrice;
	}

	public List<DrinkInt> getDrinkList()
	{
		return drinkList;
	}

	public double getTotalPrice()
	{
		return totalPrice;
	}

	public void setDrinkList(List<DrinkInt> drinkList)
	{
		this.drinkList = drinkList;
	}

	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice = totalPrice;
	}
}
