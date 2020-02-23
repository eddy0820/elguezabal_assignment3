package elguezabal_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 
{
	public static int readDifficulty()
	{
		int difficulty;
		System.out.println("Enter a difficulty(1, 2, 3, or 4): ");
		
		Scanner keyboard = new Scanner(System.in);
		difficulty = keyboard.nextInt();
		
		return difficulty;
	}
		
	public static int generateQuestionArgument(int difficulty)
	{
		SecureRandom int1 = new SecureRandom();
		int num = 0;
		
		switch(difficulty)
		{
			case 1:
				num = int1.nextInt(10);
				break;
				
			case 2:
				num = int1.nextInt(100);
				break;
				
			case 3:
				num = int1.nextInt(1000);
				break;
			
			case 4:
				num = int1.nextInt(10000);
				break;
		}
		
		return num;
	}
}
