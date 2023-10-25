import java.util.Scanner;

public class EvenOddSum
 {
    public static void main(String[] args)
	 {
        Scanner Number = new Scanner(System.in);
        int number;
        int evenSum = 0;
        int oddSum = 0;
        
        do 
		{
            System.out.print("Enter an eight digit number: ");
            number = Number.nextInt();
            
            if (number < 0) 
			{
                System.out.println("Input number cannot be negative.");
				return;
            }

			else if(number==0)
			{
				System.out.println("Input number cannot be zero.");
				return;
			}

        } 
		
		while (number < 0);
        int digit;
        while (number > 0)
		 {
            digit = number % 10;
            if (digit % 2 == 0) 
			{
                evenSum += digit;
            } 
			else 
			{
                oddSum += digit;
            }
            number /= 10;
        }
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}