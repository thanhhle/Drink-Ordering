
public interface Factory 
{
	public Drink createDrink(String kind);
	public Topping createTopping(String topping, DrinkInt drink);
}
