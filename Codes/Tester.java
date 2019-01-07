import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		OrderCareTaker careTaker = new OrderCareTaker();
		
		// Ask for customers' orders and save them
		while(true)
		{	
			DrinksAndPrice dp = placeOrder();
			System.out.println("Total price: " + dp.getTotalPrice());
			saveOrder(dp, careTaker);
			System.out.println("Is there any customer else? (Y/N)");
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("N"))
				break;
		}
		
		//Press enter to continue
		input.nextLine();
		
		// Find an stored order by index or customer's name and display it
		System.out.println("Do you want to get a stored order? (Y/N)");
		String answer = input.nextLine();
		while(answer.equalsIgnoreCase("Y"))
		{
			getOrder(careTaker);
			System.out.println("Do you want to get another order? (Y/N)");
			answer = input.nextLine();
		}
		
		System.out.println("The program ends!");
	}
	
	public static DrinksAndPrice placeOrder()
	{
		double totalPrice = 0.0;
		List<DrinkInt> drinkList = new ArrayList<DrinkInt>();
		
		Scanner input = new Scanner(System.in);
		
		DrinkFactory df = new DrinkFactory();
		ToppingFactory tf = new ToppingFactory();
		
		while(true)
		{
			System.out.println("Enter type of drink (Milk Tea, Juice, and Smoothie): ");
			DrinkInt orderedDrink = df.createDrink(input.nextLine());
		
			Visitor visitor = new PriceVisitor();
			double drinkPrice = visitor.visit(orderedDrink);
		
			System.out.println("Want to add topping? (Y/N)");
			String addMoreTopping = input.nextLine();
		
			while(addMoreTopping.equalsIgnoreCase("Y"))
			{
				System.out.println("Enter type of topping (Boba, Jelly, and WhippingCream): ");
				String topping = input.nextLine();
	
				orderedDrink = tf.createTopping(topping, orderedDrink);
				drinkPrice += visitor.visit(orderedDrink);
			
				System.out.println("Want to add more toppings? (Y/N)");
				addMoreTopping = input.nextLine();
			}
		
			orderedDrink.makeDrink();
			System.out.println("Price: " + drinkPrice);
			
			drinkList.add(orderedDrink);
			totalPrice += drinkPrice;
			
			System.out.println("Want to continue order another drink? (Y/N)");
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("N"))
				break;
		}

		DrinksAndPrice dp = new DrinksAndPrice(drinkList, totalPrice);
		return dp;
	}
	
	public static void saveOrder(DrinksAndPrice dp, OrderCareTaker careTaker)
	{
		Scanner input = new Scanner(System.in);
		Order order = new Order();
		System.out.println("Enter customer's name");
		String customerName = input.nextLine();
		order.setOrder(customerName, dp);
		careTaker.add(order.saveOrder());	
	}
	
	public static void getOrder(OrderCareTaker careTaker)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Get stored order by:");
		System.out.println("    1) Index of order");
		System.out.println("    2) Name of customer");
		System.out.println("Enter 1 or 2");

		String answer = input.nextLine();
		if(answer.equals("1"))
		{
			System.out.println("Enter index:");
			int index = input.nextInt();
			input.nextLine();
			getOrderByIndex(index, careTaker);
		}
		else
		{
			System.out.println("Enter customer's name:");
			String customerName = input.nextLine();
			getOrderByCustomerName(customerName, careTaker);
		}
	}
	
	public static void getOrderByIndex(int index, OrderCareTaker careTaker)
	{
		Order order = new Order();
		order.getOrderFromMemento(careTaker.get(index));
		System.out.println(order);
	}
	
	public static void getOrderByCustomerName(String customerName, OrderCareTaker careTaker)
	{
		Order order = new Order();
		order.getOrderFromMemento(careTaker.get(customerName));
		System.out.println(order);
	}
}