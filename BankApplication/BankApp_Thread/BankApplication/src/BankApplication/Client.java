package BankApplication;

public class Client {

	public static void main(String[] args)  {
		ICICIBank bank = new ICICIBank(); // Create Object; 
		
		try
		{
			System.out.println(bank.createAccount(101, 5000)); //Passing Transaction details using object;
			System.out.println(bank.createAccount(102, 3000));

		}catch(InsufficientOpeningBalanceException io) // catch the exception if accountNumber invalid;
		{
			System.out.println("\nInsufficient Opening Account Balance  ");
		}
		
		BankRunner bankRunner = new BankRunner(bank);
		
		Thread childThread1=new Thread(bankRunner,"first");
		childThread1.start();
		
		Thread childThread2=new Thread(bankRunner,"second");
		childThread2.start();
		
		

	}

}