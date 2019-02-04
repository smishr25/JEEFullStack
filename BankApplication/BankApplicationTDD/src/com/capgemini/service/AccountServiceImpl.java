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

	public int withdrawAmount(int accountNumber, int amount)
			throws InsufficientBalanceException, InvalidAccountNumberException {
		Account account = accountRepo.searchAccount(accountNumber);

		if (account == null) {
			System.out.println("Withdraw if");
			throw new InvalidAccountNumberException();
		}
		if ((account.getAmount() - amount) <= 0) {
			throw new InsufficientBalanceException();

		}
		account.setAmount(account.getAmount() - amount);
		accountRepo.save(account);
		return account.getAmount();

	}

	public int DepositAmount(int accountNumber, int amount) throws InvalidAccountNumberException {
		Account account = accountRepo.searchAccount(accountNumber);
		if (account == null) {
			System.out.println("Deposit if");
			throw new InvalidAccountNumberException();
		}
		account.setAmount(account.getAmount() + amount);
		accountRepo.save(account);
		return account.getAmount();
		// throw new InvalidAccountNumberException();

	}

}
