package elguezabal_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 
{
	public static void quiz()
	{
		int counter = 0;
		int difficulty = 0;
		int problemType = 0;
		
		difficulty = CAI4.readDifficulty();
		problemType = CAI5.readProblemType();
		
		System.out.println("Answer only in Integers");
		for(int i = 0; i < 10; i++)
		{
			if(askQuestion(CAI4.generateQuestionArgument(difficulty), CAI4.generateQuestionArgument(difficulty), problemType) == 1)
			{
				counter++;
			}
		}	
		
		CAI3.displayCompletionMessage(counter);
		
		CAI3.prompt();
		
	}
	public static int askQuestion(int num1, int num2, int problemTypeInt)
	{
		int counter = 1;
		String problemType = "";
		
		problemType = CAI5.problemTypeToString(problemTypeInt);
		
		System.out.println("How much is " + num1 + " " + problemType + " " + num2 + "?");
		
		if(isAnswerCorrect(num1, num2, problemTypeInt, problemType) == counter)
		{
			return counter;
		}
		return 0;	
		
	}
	
	public static int readResponse()
	{
		int response;
		
		Scanner keyboard = new Scanner(System.in);
		
		response = keyboard.nextInt();
		
		return response;
	}
	
	public static int isAnswerCorrect(int num1, int num2, int problemTypeInt, String problemType)
	{
		switch(problemTypeInt)
		{
			case 1:
				
				return CAI5.isAnswerCorrectAddition(num1, num2);
				
			case 2:
				
				return CAI5.isAnswerCorrectMultiplication(num1, num2);
				
			case 3:
				
				return CAI5.isAnswerCorrectSubtraction(num1, num2);
				
			case 4:
				
				return CAI5.isAnswerCorrectDivision(num1, num2);
				
			case 5:
				
				return CAI5.isAnswerCorrectAll(num1, num2, problemType);
			
			default:
				
				return 0;
				
		}
	
	}
	
	public static void displayCorrectResponse()
	{
		CAI2.randomPositiveResponse();
	}
	
	public static void displayIncorrectResponse()
	{
		CAI2.randomNegativeResponse();
	}
	
	public static void main(String args[])
	{
		quiz();
	}
	
}
