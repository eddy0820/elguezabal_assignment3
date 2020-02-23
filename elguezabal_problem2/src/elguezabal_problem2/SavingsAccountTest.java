package elguezabal_problem2;

public class SavingsAccountTest 
{
	public static void main(String args[])
	{
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
	
		SavingsAccount.modifyInterestRate(0.04);
		
		System.out.printf("----------------------------------\n");
		System.out.printf("|  Month  |  Saver1  |  Saver 2  |\n");
		System.out.printf("|---------|----------|-----------|\n");
		System.out.printf("|  Start  | %.2f  |  %.2f  |\n", saver1.getSavingsBalance(), saver2.getSavingsBalance());
		System.out.printf("|---------|----------|-----------|\n");
		
		for (int i = 0; i < 12; i++)
		{
			if(i < 9)
			{
				System.out.printf("|    %d    | %.2f  |  %.2f  |\n", i + 1, saver1.calculateMonthlyInterest(), saver2.calculateMonthlyInterest());
			}
			else
			{
				System.out.printf("|    %d   | %.2f  |  %.2f  |\n", i + 1, saver1.calculateMonthlyInterest(), saver2.calculateMonthlyInterest());
			}
				
		}
		
		SavingsAccount.modifyInterestRate(0.05);
		
		System.out.printf("|    13   | %.2f  |  %.2f  |\n", saver1.calculateMonthlyInterest(), saver2.calculateMonthlyInterest());		
		System.out.printf("----------------------------------\n");
		
		
	}
}
