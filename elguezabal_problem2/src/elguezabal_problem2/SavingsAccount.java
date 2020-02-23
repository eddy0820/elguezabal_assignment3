package elguezabal_problem2;

public class SavingsAccount 
{
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount(double initialBalance)
	{
		savingsBalance = initialBalance;
	}

	public double calculateMonthlyInterest()
	{
		setSavingsBalance(savingsBalance + (savingsBalance * annualInterestRate / 12));
		return getSavingsBalance();
	}
	
	public static void modifyInterestRate(double interestRate)
	{
		annualInterestRate = interestRate;
	}
	
	public double getSavingsBalance()
	{
		return this.savingsBalance;
	}
	
	public void setSavingsBalance(double newBalance)
	{
		this.savingsBalance = newBalance;
	}
	
}
