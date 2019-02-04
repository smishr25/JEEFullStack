package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientInitialAmountException;
import com.capgemini.exceptions.InvalidAccountNumberException;

public interface AccountService {
	
	Account createAccount(int accountNumber, int amount) throws InsufficientInitialAmountException;
	Account withdrawAmount(int accountNumber, int amount)throws InsufficientBalanceException;
	Account DepositAmount(int accountNumber, int amount) throws InvalidAccountNumberException;

}
