import java.util.ArrayList;
import java.util.List;

public class OrderCareTaker
{
	private List<MementoOrder> orderList = new ArrayList<MementoOrder>();
	
	public void add(MementoOrder order)
	{
		orderList.add(order);
	}
	
	public MementoOrder get(int index)
	{
		return orderList.get(index);
	}	
	
	public MementoOrder get(String customerName)
	{
		for(int i = 0; i < orderList.size(); i++)
		{
			if(orderList.get(i).getCustomerName().equals(customerName))
			{
				return orderList.get(i);
			}
		}
		return null;
	}
}
