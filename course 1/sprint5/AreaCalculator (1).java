import java.util.Scanner;
public class AreaCalculator
{
	public static void main(String[]input)
	{
		Scanner calculator = new Scanner(System.in);
		
			
                System.out.print("Enter the side length of the square fence: ");
                float squareSide = calculator.nextFloat();
                float squareArea = calculateAreaOfSquare(squareSide);
                System.out.println("square area for the chickens: " + squareArea);
				
                
                
                System.out.print("Enter the radius of the circle fence: ");
                float circleRadius = calculator.nextFloat();
                double circleArea = calculateAreaOfCircle(circleRadius);
                System.out.println("circular area for ducks: " + circleArea);
	
            
                
            
			    System.out.print("Enter the length of the rectangle fence: ");
                float rectanglelength = calculator.nextFloat();
                System.out.print("Enter the width of the rectangle: ");
                float rectanglewidth = calculator.nextFloat();
                float rectangleArea = calculateAreaOfRectangle(rectanglelength,rectanglewidth);
			    System.out.println("rectangular area for cows: " + rectangleArea);
				
            calculator.close();

    }
     public  static float calculateAreaOfSquare(float side)
	 {
		 return side*side;
	 }

	 public static double calculateAreaOfCircle(double radius)
	 {
		 return 3.14*radius*radius;
	 }

	 public static float calculateAreaOfRectangle(float length,float width)
	 {
		 return length*width;
	 }
}


	