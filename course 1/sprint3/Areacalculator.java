import java.util.Scanner;
public class Areacalculator
{
	public static void main(String[]input)
	{
		Scanner calculator = new Scanner(System.in);
		
		System.out.println("select the an option from list to calculate area of fence ");
		System.out.println("1. square area for the chickens ");
		System.out.println("2. circular area for ducks ");
		System.out.println("3. rectangular area for cows ");

		System.out.println("--------------------------------------------------------------------");
        
		int option;
		System.out.println("\n");
		System.out.println("select the option you need : ");
		System.out.println("--------------------------------------------------------------------");
		
		option=calculator.nextInt();
		  switch (option) 
		  {
            
			case 1:
			System.out.println("--------------------------------------------------------------------");
                System.out.print("Enter the side length of the square fence: ");
                float side = calculator.nextFloat();
                float squareArea = calculateAreaOfSquare(SquareSide);
				System.out.println("\n");
                System.out.println("square area for the chickens: " + squareArea);
				System.out.println("--------------------------------------------------------------------");
                break;
                
            case 2:
			    System.out.println("--------------------------------------------------------------------");
                System.out.print("Enter the radius of the circle fence: ");
                float Radius = calculator.nextFloat();
                double circleArea = calculateAreaOfCircle(CircleRadius);
				System.out.println("\n");
                System.out.println("circular area for ducks: " + circleArea);
				System.out.println("--------------------------------------------------------------------");
                break;
                
            case 3:
			System.out.println("--------------------------------------------------------------------");
                System.out.print("Enter the length of the rectangle fence: ");
                float length = calculator.nextFloat();
                System.out.print("Enter the width of the rectangle: ");
                float width = calculator.nextFloat();
                float rectangleArea = calculateAreaOfRectangle(rectanglelength,reactanglewidth)
				System.out.println("\n");
                System.out.println("rectangular area for cows: " + rectangleArea);
				System.out.println("--------------------------------------------------------------------");
                break;
                
            default:
                System.out.println("Invalid option!");
        }
        
        calculator.close();

    }
     public double calculateAreaOfSquare(double side)
	 {
		 return side*side;
	 }

	 public double calculateAreaOfCircle(double radius);
}


	