package BankApplication;

import java.util.LinkedList;

public class ICICIBank {

	LinkedList<Account> accounts = new LinkedList<>();

	public String createAccount(int accountNumber, int amount) throws InsufficientOpeningBalanceException {

		if (amount < 1000) {
			throw new InsufficientOpeningBalanceException();
		}
		Account account = new Account(accountNumber, amount); // Creating Object of Account Class with accountNumber and
																// amount;

		accounts.add(account); // Inserting into 'accounts' LinkededList using 'account' object;

		return "\n-->Account created successfully with account Number " + account.getAccountNumber()
				+ "\nAvailable Balance in account is: " + account.getAmount();
	}

	private Account searchAccount(int accountNumber) throws InvalidAccountNumberException // throws the exception to
																							// InvalidAccountNumber
																							// class;
	{

		for (Account account : accounts) // Iterate to the LinkedList;
		{
			if (account.getAccountNumber() == accountNumber) // Check if accountNumber received matches existing
																// accountNumbers;
			{
				return account; // return the account number;
			}
		}
		throw new InvalidAccountNumberException(); // throw an InavlidAccountNumberException when accountNumber not
													// found;

	}

	public String withdrawAmount(int accountNumber, int amount)
			throws InvalidAccountNumberException, InsufficientBalanceException {
		Account account = searchAccount(accountNumber); // call the searchAmount method to check the amountNumber;
		synchronized (account) {
			if ((account.getAmount() - amount) >= 0) // If valid accountNumber then check if withdrawal is possible;
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				account.setAmount(account.getAmount() - amount); // update the accountBalance after withdrawal;
				return "\n-->Rs. " + amount + " deducted from accountNumber " + account.getAccountNumber()
						+ "\nAvailable balance is : " + account.getAmount(); // return the updated accountBalance;
			}

			throw new InsufficientBalanceException();
		}
	}

	public String DepositAmount(int accountNumber, int amount) throws InvalidAccountNumberException {
		Account account = searchAccount(accountNumber);
		account.setAmount(account.getAmount() + amount);
		return "\n-->Rs. " + amount + " credited to accountNumber " + account.getAccountNumber()
				+ "\nAvailable balance is : " + account.getAmount();
	}

	public String FundTranser(int tAccountNumber, int rAccountNumber, int amount)
			throws InvalidAccountNumberException, InsufficientBalanceException {
		Account tAccount = searchAccount(tAccountNumber);
		Account rAccount = searchAccount(rAccountNumber);
		withdrawAmount(tAccountNumber, amount);
		DepositAmount(rAccountNumber, amount);

		return "\n--> Rs. " + amount + " transferred from accountNumber " + tAccount.getAccountNumber()
				+ " to accountNumber " + rAccount.getAccountNumber() + "\nAvailable balance in accountNumber "
				+ tAccount.getAccountNumber() + " is: " + tAccount.getAmount() + "\nAvailable balance in accountNumber "
				+ rAccount.getAccountNumber() + " is: " + rAccount.getAmount();
	}

}