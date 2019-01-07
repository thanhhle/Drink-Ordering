import java.util.Scanner;

public class DrinkFactory implements Factory
{
	public Drink createDrink(String drinkType)
	{
		Scanner input = new Scanner(System.in);
		drinkType = drinkType.replaceAll("\\s","").toLowerCase();
		while(!drinkType.equals("milktea") && !drinkType.equals("juice") && !drinkType.equals("smoothie"))
		{
			System.out.println("Enter your choice again: ");
			drinkType = input.nextLine().replaceAll("\\s","").toLowerCase();
		}
		
		if(drinkType.equals("milktea"))				return new MilkTea();
		else if(drinkType.equals("juice"))			return new Juice();
		else 										return new Smoothie();
	}
	
	public Topping createTopping(String topping, DrinkInt drink)
	{
		return null;
	}
}
