package elguezabal_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 
{
	public static int readProblemType()
	{
		int problemType;
		
		System.out.println("Enter a problem type(1 = addition, 2 = multiplication, 3 = subtraction, 4 = division, 5 = mix of all): ");
		
		Scanner keyboard = new Scanner(System.in);
		problemType = keyboard.nextInt();
		
		return problemType;
	}
	
	public static String problemTypeToString(int problemType)
	{
		String problemTypeString = "";
		switch(problemType)
		{
			case 1:
				problemTypeString = "plus";
				break;
				
			case 2:
				problemTypeString = "times";
				break;
				
			case 3:
				problemTypeString = "minus";
				break;
				
			case 4:
				problemTypeString = "divided by";
				break;
				
			case 5:
				problemTypeString = problemType5ToString();
				break;
				
		}
		
		return problemTypeString;
	}
	
	public static String problemType5ToString()
	{
		String problemType = "";
		int subType;
		
		SecureRandom int1 = new SecureRandom();
		
		subType = int1.nextInt(4);
		
		switch(subType)
		{
			case 0:
				problemType = "plus";
				break;
				
			case 1:
				problemType = "times";
				break;
				
			case 2:
				problemType = "minus";
				break;
				
			case 3:
				problemType = "divided by";
				break;
				
		}
		
		return problemType;
	}
	
	public static int isAnswerCorrectAddition(int num1, int num2)
	{
		int answer;
		int counter = 1;
		
		answer = num1 + num2;
		
		if (CAI1.readResponse() == answer)
		{
			CAI1.displayCorrectResponse();
			return counter;
		}
		else
		{
			CAI1.displayIncorrectResponse();
			return 0;
		}
	}
	
	public static int isAnswerCorrectSubtraction(int num1, int num2)
	{
		int answer;
		int counter = 1;
		
		answer = num1 - num2;
		
		if (CAI1.readResponse() == answer)
		{
			CAI1.displayCorrectResponse();
			return counter;
		}
		else
		{
			CAI1.displayIncorrectResponse();
			return 0;
		}
	}
	
	public static int isAnswerCorrectMultiplication(int num1, int num2)
	{
		int answer;
		int counter = 1;
		
		answer = num1 * num2;
		
		if (CAI1.readResponse() == answer)
		{
			CAI1.displayCorrectResponse();
			return counter;
		}
		else
		{
			CAI1.displayIncorrectResponse();
			return 0;
		}
	}
	
	public static int isAnswerCorrectDivision(int num1, int num2)
	{
		int answer; 
		int counter = 1;
		
		answer = num1 / num2;
		
		if (CAI1.readResponse() == answer)
		{
			CAI1.displayCorrectResponse();
			return counter;
		}
		else
		{
			CAI1.displayIncorrectResponse();
			return 0;
		}
	}
	
	public static int isAnswerCorrectAll(int num1, int num2, String problemType)
	{
		int answer;
		int counter = 1;
		
		switch(problemType)
		{
			case "plus":
				answer = num1 + num2;
				
				if (CAI1.readResponse() == answer)
				{
					CAI1.displayCorrectResponse();
					return counter;
				}
				else
				{
					CAI1.displayIncorrectResponse();
					return 0;
				}
				
			case "times":
				answer = num1 * num2;
				
				if (CAI1.readResponse() == answer)
				{
					CAI1.displayCorrectResponse();
					return counter;
				}
				else
				{
					CAI1.displayIncorrectResponse();
					return 0;
				}
				
			case "minus":
				answer = num1 - num2;
				
				if (CAI1.readResponse() == answer)
				{
					CAI1.displayCorrectResponse();
					return counter;
				}
				else
				{
					CAI1.displayIncorrectResponse();
					return 0;
				}
				
			case "divided by":
				answer = num1 / num2;
				
				if (CAI1.readResponse() == answer)
				{
					CAI1.displayCorrectResponse();
					return counter;
				}
				else
				{
					CAI1.displayIncorrectResponse();
					return 0;
				}
			
			default:
				return 0;
				
		}
	}
	
}
