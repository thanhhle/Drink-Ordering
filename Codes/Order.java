import java.util.List;

public class Order
{
	private String customerName;
	private List<DrinkInt> drinkList;
	private double totalPrice;
	
	public void setOrder(String customerName, DrinksAndPrice dp)
	{
		this.customerName = customerName;
		this.drinkList = dp.getDrinkList();
		this.totalPrice = dp.getTotalPrice();
	}
	
	public MementoOrder saveOrder()
	{
		return new MementoOrder(customerName, new DrinksAndPrice(drinkList, totalPrice));
	}
	
	public void getOrderFromMemento(MementoOrder m)
	{
		this.customerName = m.getCustomerName();
		this.drinkList = m.getDrinkList();
		this.totalPrice = m.getTotalPrice();
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
