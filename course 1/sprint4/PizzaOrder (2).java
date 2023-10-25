import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] input) {
        Scanner food = new Scanner(System.in);

        double priceofpizza = 12.99;
        double priceofgarlicbread = 5.99;
        double priceofbeverages = 1.99;

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!WELCOME!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("********ENTER THE CUSTOMER DETAILS TO PLACE AN ORDER*********");

        System.out.println("ENTER YOUR NAME : ");
        String name = food.nextLine();

        System.out.println("ENTER YOUR EMAIL : ");
        String email = food.nextLine();

        System.out.println("ENTER YOUR CONTACT NO: ");
        long contact = food.nextLong();

        System.out.println("ENTER YOUR ADDRESS: ");
        String address = food.next();

        System.out.println("\n*********THANK YOU FOR PROVIDING YOUR DETAILS*************\n");

        int order,choice;
        double totalBillAmount = 0; 
        
        do
		 {
            System.out.println("------------------------------------------------------------------");
            System.out.println("*************SELECT THE ITEM FROM THE MAIN MENU******************");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("SL NO\t ITEM NAME");
            System.out.println("1\t PIZZA");
            System.out.println("2\t GARLIC BREAD");
            System.out.println("3\t BEVERAGES");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("ENTER 1 FOR PIZZA, 2 FOR GARLIC BREAD, AND 3 FOR BEVERAGES");
            System.out.println("-----------------------------------------------------------------");

            order = food.nextInt();

            switch (order) 
			{
                case 1:
                    System.out.println("------------------------------------------------------------- ");
                    System.out.println("ENTER THE NUMBER OF PIZZAS YOU WANT");
                    int noofpizzaordered = food.nextInt();
                    double pizzaAmount = noofpizzaordered * priceofpizza;
                    System.out.println("TOTAL AMOUNT OF ORDERED PIZZA : $" + pizzaAmount);
                    totalBillAmount += pizzaAmount; 
                    System.out.println("------------------------------------------------------------- ");
                    break;

                case 2:
                    System.out.println("------------------------------------------------------------- ");
                    System.out.println("ENTER THE NUMBER OF GARLIC BREADS YOU WANT");
                    int noofgarlicbreadordered = food.nextInt();
                    double garlicBreadAmount = noofgarlicbreadordered * priceofgarlicbread;
                    System.out.println("TOTAL AMOUNT OF ORDERED GARLIC BREAD : $" + garlicBreadAmount);
                    totalBillAmount += garlicBreadAmount;  
                    System.out.println("------------------------------------------------------------- ");
                    break;

                case 3:
                    System.out.println("------------------------------------------------------------- ");
                    System.out.println("ENTER THE NUMBER OF BEVERAGES YOU WANT");
                    int noofbeveragesordered = food.nextInt();
                    double beveragesAmount = noofbeveragesordered * priceofbeverages;
                    System.out.println("TOTAL AMOUNT OF ORDERED BEVERAGES : $" + beveragesAmount);
                    totalBillAmount += beveragesAmount; 
                    System.out.println("------------------------------------------------------------- ");
                    break;

                default:
                    System.out.println("Invalid order!!");
            }
         System.out.println("DO YOU WANT TO PLACE ANOTHER ORDER 1 for yes / 0 for no ");
            choice = food.nextInt(); 
		 }
		
		while (choice==1);
        System.out.println("Total bill amount: $" + totalBillAmount);
        if (totalBillAmount > 50) 
		{
            double discount = 0.1 * totalBillAmount; 
            double discountedBillAmount = totalBillAmount - discount;
            System.out.println("Discount: $" + discount);
            System.out.println("Discounted bill amount: $" + discountedBillAmount);
        } 
		else
		{
            System.out.println("No discount provided since the bill amount is less than $50");
        }

        food.close();
    }
}