package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientInitialAmountException;
import com.capgemini.repo.AccountRepo;

import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;

public class AccountServiceImpl implements AccountService {
	AccountRepo accountRepo;

	public AccountServiceImpl(AccountRepo accountRepo) {
		this.accountRepo = accountRepo;
	}

	@Override
	public Account createAccount(int accountNumber, int amount) throws InsufficientInitialAmountException {
		if (amount < 500) {
			throw new InsufficientInitialAmountException();
		}
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setAmount(amount);
		if (accountRepo.save(account)) {
			return account;
		}

		return null;
	}

	public Account withdrawAmount(int accountNumber, int amount) throws InsufficientBalanceException {
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		synchronized (account) {
			if ((account.getAmount() - amount) >= 0) //
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				account.setAmount(account.getAmount() - amount);
				return account;
			}

			throw new InsufficientBalanceException();

		}
	}

	public Account DepositAmount(int accountNumber, int amount) throws InvalidAccountNumberException {
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		account.setAmount(account.getAmount() + amount);
		return account;
		//throw new InvalidAccountNumberException();

	}

}
