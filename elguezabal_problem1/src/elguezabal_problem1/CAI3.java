package elguezabal_problem1;

import java.util.Scanner;

public class CAI3 
{
	public static void displayCompletionMessage(int ansRight)
	{
		double percent;
		
		percent = ansRight * 10;
		
		System.out.println("Your Score is: " + percent + "%.");
		
		if(percent < 75)
		{
			System.out.println("Please ask teacher for extra help.");
		}
		else if (percent >= 75)
		{
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		
	}
	public static void prompt()
	{
		String promptChoice;
		System.out.println("Would you like to answer more questions? Enter y for Yes and n for No.");
		
		Scanner keyboard = new Scanner(System.in);
		
		promptChoice = keyboard.nextLine();
		
		if(promptChoice.equalsIgnoreCase("y"))
		{
			CAI1.quiz();
		}
		else if(promptChoice.equalsIgnoreCase("n"))
		{
			System.exit(0);
		}
		
	}
}
