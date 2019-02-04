package BankApplication;

public class BankRunner implements Runnable {

	ICICIBank bank;

	public BankRunner(ICICIBank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {

		try {
			if (Thread.currentThread().getName().equals("first")) {
				System.out.println(bank.withdrawAmount(101, 2000));// Passing withdrawal details using object;
			} else {
				System.out.println(bank.withdrawAmount(101, 2000)); // Passing withdrawal details using object;
			}

		} catch (InvalidAccountNumberException i) // catch the exception if accountNumber invalid;
		{
			System.out.println("\nInvalid account number ");
		} catch (InsufficientBalanceException ibe) { // catch the exception if accountBalance insufficient;
			System.out.println("\nInsufficient balance");
		}

	}

}
