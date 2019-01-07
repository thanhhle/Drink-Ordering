import java.util.List;

public class MementoOrder
{
	private String customerName;
	private List<DrinkInt> drinkList;
	private double totalPrice;
	
	public MementoOrder(String customerName, DrinksAndPrice dp)
	{
		this.customerName = customerName;
		this.drinkList = dp.getDrinkList();
		this.totalPrice = dp.getTotalPrice();
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	public List<DrinkInt> getDrinkList()
	{
		return drinkList;
	}
	
	public double getTotalPrice()
	{
		return totalPrice;
	}
	
	public String toString()
	{
		String str = "Customer's name: " + customerName + "\n" +
				"List of ordered drinks: " + "\n";
		
		for(int i = 0; i < drinkList.size(); i++)
			str += "\t" + (i+1) + ") " + drinkList.get(i).toString() + "\n";
		
		str += "Total Price: " + totalPrice + "\n";
		return str;
	}
}
