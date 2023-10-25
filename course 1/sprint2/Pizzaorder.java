class Pizzaorder
{
	public static void main(String[] args)
	{
		String customername="Gary";
		String customeremail="gary@123.com";
		int phoneno=412312345;
		String address="20,marble drive,eville";
		int noofPizzaOrdered=5;
		double pizzaprice=12.5;
		double gt=noofPizzaOrdered*pizzaprice;//gt= total price of pizza
		char pizzasize='M';
		int noofgarlicbreadordered=3;
		double garlicbreadprice=5.99;
		double gt2=noofgarlicbreadordered*garlicbreadprice;//gt2 is total price of garlic bread
		int noofbeveragesordered=3;
		double beverageprice=1.99;
		double gt3=noofbeveragesordered*beverageprice;//gt3=total price of beverges
		double grandtotal=gt+gt2+gt3;//grand total of all the items purchased by the customer
		System.out.println("------------------------------");
		System.out.println("Customer details");
		System.out.println("------------------------------");
		System.out.println("customername = " +customername);
		System.out.println("customeremail = "+customeremail);
		System.out.println("address = " +address);
		System.out.println("phoneno = " +phoneno);
		System.out.println("----------------------------------------------------------------");
		System.out.println("                         order summary                          ");
		System.out.println("----------------------------------------------------------------");
		System.out.println("sr no\titemname\titemquatity\t$price/unit\t$totalprice");
        System.out.println("1\tPizza\t\t"+noofPizzaOrdered+"\t\t"+pizzaprice+"\t\t"+gt);
		System.out.println("2\tGarlicbread\t"+noofgarlicbreadordered+"\t\t"+garlicbreadprice+"\t\t"+gt2);
        System.out.println("3\tbeverages\t"+noofbeveragesordered+"\t\t"+beverageprice+"\t\t"+gt3);
		System.out.println("----------------------------------------------------------------");
		System.out.println("****************************************************************");
		System.out.println("                        Total bill amount : "+"$"+
		grandtotal);
		System.out.println("                         discount offered :10% "                  );
		double amounttobepaid=grandtotal - (grandtotal*10/100);//discounted amount
		System.out.println("                 discount amount to be paid :" +amounttobepaid);
		System.out.println("****************************************************************");
		System.out.println("****************************THANK YOU***************************");


	}
	
}
