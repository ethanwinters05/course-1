import java.util.Scanner;

public class PizzaOrder
{
	public void displayCustomerDetails(String name, String email, long phoneno, String address) 
	{
		System.out.println("Customer Details");
		System.out.println("---------------------------------");
		System.out.println("name of the customer is : " + name);
		System.out.println("email of the customer is : " + email);
		System.out.println("contact No of the customer is : " + phoneno);
		System.out.println("address of the customer is : " + address);
	}

	public void displayMenu() {
		System.out.println("Select the items to order");
		System.out.println("\n\nSI NO\tItem Category");
		System.out.println("------------------------------------");
		System.out.println(
				"1.Pizza\n Price of one regular pizza :$9.99\n price of one medium pizza :$11.99\n price of one large pizza :$13.99");
		System.out.println("2.Garlic Bread\n price of one garlic bread :$5.99");
		System.out.println("3.Beverages\n price of one beverage :$1.99");
		System.out.println("Enter 1 for pizza, 2 for Garlic Bread, 3 for Beverage");

	}

	public float getPriceOfPizzaBasedOnSize(int size) {
		float priceOfPizza = 0;
		if (size == 1) 
		{
			priceOfPizza = 9.99f;
		} 
		else if (size == 2) 
		{
			priceOfPizza = 11.99f;
		} 
		else if (size == 3) 
		{
			priceOfPizza = 13.99f;
		} 
		else 
		{
			System.out.println("Invalid size,Enter 1,2 or 3");
			priceOfPizza = 0;
		}
		return priceOfPizza;
	}

	public float getpriceOfGarlicBread() 
	{
		return 5.99f;
	}

	public float getpriceOfBeverage() 
	{
		return 1.99f;
	}

	public float calculatePriceOfPizza(int noOfPizza, float priceOfPizza) 
	{
		float totalPizzaPrice = noOfPizza * priceOfPizza;
		return totalPizzaPrice;
	}

	public float calculatePriceOfGarlicBread(int noOfGarlicBread, float priceOfGarlicBread) 
	{
		float totalGarlicBreadPrice = noOfGarlicBread * priceOfGarlicBread;
		return totalGarlicBreadPrice;
	}

	public float calculatePriceOfBeverage(int noOfBeverages, float priceOfBeverages) 
	{
		float totalBeveragePrice = noOfBeverages * priceOfBeverages;
		return totalBeveragePrice;
	}

	public float calculateTotalBill(float totalPizzaPrice, float totalGarlicBreadPrice, float totalBeveragePrice) 
	{
		float totalBillAmount = totalPizzaPrice + totalGarlicBreadPrice + totalBeveragePrice;
		return totalBillAmount;

	}

	public float calculateDiscountAndReturnBillAmount(float totalBillAmount) 
	{
		float discountedAmount = 0;
		if (totalBillAmount > 50) {
			discountedAmount = totalBillAmount - (totalBillAmount * 10 / 100f);
			System.out.println("The Discounted Bill Amount is : $" + discountedAmount);
		} 
		else 
		{
			System.out.println("No discount bill");

		}
		return discountedAmount;
	}

	public void displayOrderDetails(int noOfPizza, int noOfGarlicBread, int noOfBeverages, int size,
			float totalBillAmount) 
			{
		System.out.println("Order Details");
		System.out.println("-----------------------------");
		System.out.println("The number of pizzas ordered : " + noOfPizza);
		System.out.println("The number of garlic bread ordered : " + noOfGarlicBread);
		System.out.println("The number of beverage : " + noOfBeverages);
		System.out.println("-----------------------------------------------------");
		System.out.println("The total Bill Amount is : $" + totalBillAmount);

	}

	public static void main(String[] input) 
	{
    PizzaOrder PO = new PizzaOrder();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your Name");
    String name = sc.next();

    System.out.println("Enter Your Email");
    String email = sc.next();

    System.out.println("Enter Your ContactNo");
    long phoneno = sc.nextLong();

    System.out.println("Enter Your Address");
    String address = sc.next();

    int choice;
    float totalPizzaPrice = 0;
    float totalGarlicBreadPrice = 0;
    float totalBeveragePrice = 0;
    int size = 0;
    int noOfPizza = 0;
    int noOfGarlicBread = 0;
    int noOfBeverages = 0;

    do 
	{
        PO.displayMenu();
        int chooseOption = sc.nextInt();
        switch (chooseOption) 
		{
            case 1:
                System.out.println("Enter size of the pizza");
                size = sc.nextInt();
                float priceOfPizza = PO.getPriceOfPizzaBasedOnSize(size);
                System.out.println("Please enter the number of pizzas you want to order");
                noOfPizza = sc.nextInt();
                totalPizzaPrice = PO.calculatePriceOfPizza(noOfPizza, priceOfPizza);
                System.out.println("Your total Pizza Bill: $" + totalPizzaPrice);
                break;
            case 2:
                System.out.println("Enter the number of garlic bread you want to order");
                noOfGarlicBread = sc.nextInt();
                float priceOfGarlicBread = PO.getpriceOfGarlicBread();
                totalGarlicBreadPrice = PO.calculatePriceOfGarlicBread(noOfGarlicBread, priceOfGarlicBread);
                System.out.println("Your total Garlic Bread: $" + totalGarlicBreadPrice);
                break;
            case 3:
                System.out.println("Enter the number of beverages you want to order");
                noOfBeverages = sc.nextInt();
                float priceOfBeverages = PO.getpriceOfBeverage();
                totalBeveragePrice = PO.calculatePriceOfBeverage(noOfBeverages, priceOfBeverages);
                System.out.println("Your total Beverages: $" + totalBeveragePrice);
                break;
        }

        System.out.println("Do you want to place another order? Enter 1 to continue or 0 to exit");
        choice = sc.nextInt();
    } 
	while (choice == 1);

    System.out.println("Customer Details");
    System.out.println("---------------------------------");
    System.out.println("Name of the customer is: " + name);
    System.out.println("Email of the customer is: " + email);
    System.out.println("Contact No of the customer is: " + phoneno);
    System.out.println("Address of the customer is: " + address);

    float totalBillAmount = PO.calculateTotalBill(totalPizzaPrice, totalGarlicBreadPrice, totalBeveragePrice);

    System.out.println("Order Details");
    System.out.println("-----------------------------");
    System.out.println("The number of pizzas ordered: " + noOfPizza);
    System.out.println("The number of garlic bread ordered: " + noOfGarlicBread);
    System.out.println("The number of beverages ordered: " + noOfBeverages);
    System.out.println("-----------------------------------------------------");
    System.out.println("The total Bill Amount is: $" + totalBillAmount);

    float totalDiscountedAmount = PO.calculateDiscountAndReturnBillAmount(totalBillAmount);
}
}
