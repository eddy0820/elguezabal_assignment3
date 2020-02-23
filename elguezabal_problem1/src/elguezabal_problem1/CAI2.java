package elguezabal_problem1;

import java.security.SecureRandom;

public class CAI2 
{
	public static void randomPositiveResponse()
	{
		SecureRandom int1 = new SecureRandom();
		int num = int1.nextInt(4);
		
		switch(num) 
		{
			case 0:
				System.out.println("Very good!");
				break;
			
			case 1:
				System.out.println("Excellent!");
				break;
				
			case 2:
				System.out.println("Nice work!");
				break;
	
			case 3:
				System.out.println("Keep up the good work!");
				break;
		}
	}
	
	public static void randomNegativeResponse()
	{
		SecureRandom int1 = new SecureRandom();
		int num = int1.nextInt(4);
		
		switch(num) 
		{
			case 0:
				System.out.println("No. Please try again.");
				break;
			
			case 1:
				System.out.println("Wrong. Try once more.");
				break;
				
			case 2:
				System.out.println("Don't give up!");
				break;
	
			case 3:
				System.out.println("No. Keep trying.");
				break;
		}
	}
	
}
