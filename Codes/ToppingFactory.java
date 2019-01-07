import java.util.Scanner;

public class ToppingFactory implements Factory
{
	public Drink createDrink(String kind)
	{
		return null;
	}

	public Topping createTopping(String topping, DrinkInt drink)
	{
		Scanner input = new Scanner(System.in);
		topping = topping.replaceAll("\\s","").toLowerCase();
		while(!topping.equals("boba") && !topping.equals("jelly") && !topping.equals("whippingcream"))
		{
			System.out.println("Enter your choice again: ");
			topping = input.nextLine().replaceAll("\\s","").toLowerCase();;
		}
		
		if(topping.equals("boba"))					return new Boba(drink);
		else if(topping.equals("jelly"))			return new Jelly(drink);
		else 										return new WhippingCream(drink);
	}
}
