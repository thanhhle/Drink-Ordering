# Drink-Ordering
A Java program that uses Factory pattern, Memento pattern, Visitor pattern, and Decorator pattern

## Description
- Customer orders drinks listed (Milk Tea, Juice, and Smoothie) and is asked if he/she wants to add any topping. Toppings availbale include Boba, Jelly, and Whipping Cream.
- Customer can order multiple drinks with multiple toppings. A list of ordered drinks and prices will appear after he/she finishes ordering.
- Customer's order details will be stored and retrieved by the customer's name or order number.

## Output
	Enter type of drink (Milk Tea, Juice, and Smoothie): 
	Milk Tea
	Want to add topping? (Y/N)
	y
	Enter type of topping (Boba, Jelly, and WhippingCream): 
	Boba
	Want to add more toppings? (Y/N)
	y
	Enter type of topping (Boba, Jelly, and WhippingCream): 
	Jelly
	Want to add more toppings? (Y/N)
	n
	Make milk tea glass!
	Add boba
	Add jelly
	Price: 4.25
	Want to continue order another drink? (Y/N)
	Y
	Enter type of drink (Milk Tea, Juice, and Smoothie): 
	Juice
	Want to add topping? (Y/N)
	n
	Make a juice glass!
	Price: 3.25
	Want to continue order another drink? (Y/N)
	n
	Total price: 7.5
	Enter customer's name
	Thanh
	Is there any customer else? (Y/N)
	Y
	Enter type of drink (Milk Tea, Juice, and Smoothie): 
	Smoothie
	Want to add topping? (Y/N)
	y
	Enter type of topping (Boba, Jelly, and WhippingCream): 
	Whipping Cream
	Want to add more toppings? (Y/N)
	n
	Make a smoothie glass
	Add Whipping Cream
	Price: 4.75
	Want to continue order another drink? (Y/N)
	n
	Total price: 4.75


	Enter customer's name
	Jack
	Is there any customer else? (Y/N)
	Y
	Enter type of drink (Milk Tea, Juice, and Smoothie): 
	Juice
	Want to add topping? (Y/N)
	n
	Make a juice glass!
	Price: 3.25
	Want to continue order another drink? (Y/N)
	n
	Total price: 3.25
	Enter customer's name
	Stella
	Is there any customer else? (Y/N)
	n

	Do you want to get a stored order? (Y/N)
	y


	Get stored order by:
    1) Index of order
    2) Name of customer
	Enter 1 or 2
	1
	Enter index:
	1
	Customer's name: Jack
	List of ordered drinks: 
		1) Smoothie - Whipping Cream
	Total Price: 4.75

	Do you want to get another order? (Y/N)
	y
	Get stored order by:
    1) Index of order
    2) Name of customer
	Enter 1 or 2
	2
	Enter customer's name:
	Thanh
	Customer's name: Thanh
	List of ordered drinks: 
	1) Milk Tea - Boba - Jelly
	2) Juice
	Total Price: 7.5

	Do you want to get another order? (Y/N)
	n
	The program ends!
