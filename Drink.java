

public abstract class Drink implements DrinkInt
{
	protected String kind;
	protected double price;
	
	public Drink(String kind)
	{
		this.kind = kind;
	}
	
	public String getKind()
	{
		return kind;
	}
	
	public void setKind(String kind)
	{
		this.kind = kind;
	}
	
	abstract public void makeDrink();
	
	public String toString()
	{
		return kind;
	}
}
