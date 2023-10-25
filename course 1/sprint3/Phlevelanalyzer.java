import java.util.Scanner;
public class Phlevelanalyzer 
{
    public static void main(String[] args) 
	{
        Scanner ph = new Scanner(System.in);

        System.out.print("Enter the pH value of the aquarium water: ");
        float phvalue = ph.nextFloat();

        if(phvalue < 7)
		{
			System.out.println("ph value is low, partial water change required");
		}
		  else if(phvalue > 8)
		{
			System.out.println("ph value is low, partial water change required ");
		}
		  else if(phvalue >= 7 && phvalue <= 8)
		{
             System.out.println("ph value is fine");
		}
	ph.close();
	}
}