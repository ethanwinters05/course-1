import java.util.Scanner;
public class PizzaOrder
{
	public static void main(String[] input)
	{
		Scanner food = new Scanner(System.in);

		double priceofpizza=12.99;
		double priceofgarlicbread=5.99;
		double priceofbeverages=1.99;
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!WELCOME!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("********ENTER THE CUSTOMER DETAILS TO PLACE AN ORDER*********");
		
		System.out.println("ENTER YOUR NAME : \n");
        String name=food.next();
		
		System.out.println("ENTER YOUR email : \n");
		String email=food.next();
		
		System.out.println("ENTER YOUR CONTACT NO: \n");
		long contact=food.nextLong();
		
		System.out.println("ENTER YOUR ADDRESS: \n");
		String address=food.next();

		System.out.println("\n*********THANK YOU FOR PROVIDING YOUR DETAILS*************\n");
		
		int order;
		do
        System.out.println("------------------------------------------------------------------");
		System.out.println("*************SELECT THE ITEM FROM THE MAIN MENU******************");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("SL NO\t ITEM NAME");
		System.out.println("1\t PIZZA");
		System.out.println("2\t GARLIC BREAD");
		System.out.println("3\t BEVERAGES");
		System.out.println("-----------------------------------------------------------------");
        System.out.println("ENTER 1 FOR PIZZA,2 FOR GARLIC BREAD  AND 3 FOR BEVERAGES");
		System.out.println("-----------------------------------------------------------------");
		

		 order=food.nextInt();
		switch(order)
		{
			
			case 1:
			System.out.println("------------------------------------------------------------- ");
			System.out.println("ENTER THE NO OF PIZZA YOU WANT");
			int noofpizzaordered=food.nextInt();
			System.out.println("TOTAL AMOUNT OF ORDERED PIZZA : "+"$"+noofpizzaordered*priceofpizza);
			System.out.println("------------------------------------------------------------- ");
			break;

			case 2:
			System.out.println("------------------------------------------------------------- ");
			System.out.println("ENTER THE NO OF GARLIC BREAD YOU WANT");
			int noofgarlicbreadordered=food.nextInt();
			System.out.println("TOTAL AMOUNT OF ORDERED GARLIC BREAD : " +"$"+noofgarlicbreadordered*priceofgarlicbread);
			System.out.println("------------------------------------------------------------- ");
			break;

			case 3:
			System.out.println("------------------------------------------------------------- ");
			System.out.println("ENTER THE NO OF BEVERAGES YOU WANT");
			int noofbeveragesordered=food.nextInt();
			System.out.println("TOTAL AMOUNT OF ORDERED beverages : "+"$"+  noofbeveragesordered*priceofbeverages);
			System.out.println("------------------------------------------------------------- ");
			break;
			
			default:
			System.out.println("invalid order!!");
			
        }
		
         food.close();
}
}