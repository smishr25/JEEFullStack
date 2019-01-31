package BankApplication;

public class Client {

	public static void main(String[] args)  {
		ICICIBank bank = new ICICIBank(); // Create Object; 
		
		try
		{
			System.out.println(bank.createAccount(101, 5000)); //Passing Transaction details using object;
			System.out.println(bank.createAccount(102, 3000));
			System.out.println(bank.withdrawAmount(101, 2000)); //Passing withdrawal details using object;
			System.out.println(bank.DepositAmount(101, 2000)); //Passing withdrawal details using object;
			System.out.println(bank.FundTranser(101,102, 1000)); //Passing withdrawal details using object;

		}catch(InsufficientOpeningBalanceException io) // catch the exception if accountNumber invalid;
		{
			System.out.println("\nInsufficient Opening Account Balance  ");
		}
		catch(InvalidAccountNumberException i) // catch the exception if accountNumber invalid;
		{
			System.out.println("\nInvalid account number ");
		}
		catch(InsufficientBalanceException ibe){ // catch the exception if accountBalance insufficient;
			System.out.println("\nInsufficient balance");
		}

	}

}