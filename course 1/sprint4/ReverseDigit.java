import java.util.Scanner;
public class ReverseDigit
{
	public static void main(String [] args)
	{
		Scanner Digit=new Scanner(System.in);
		System.out.println("enter the number : ");
		int number=Digit.nextInt();

		if(number<0)
		{
			System.out.println("Input number cannot be negative  ");
			return;
		}
		else if(number==0)
		{
			System.out.println("Input number cannot be zero  ");
			return;
		}

         int reversednumber=0;
		 while (number != 0) 
		{
            int digit = number % 10;
            reversednumber = reversednumber * 10 + digit;
            number /= 10;
        }
		
		 System.out.println("The reverse of the given number is : " + reversednumber);
	}
}