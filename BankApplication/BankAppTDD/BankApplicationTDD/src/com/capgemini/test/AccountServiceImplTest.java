package com.capgemini.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientInitialAmountException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.repo.AccountRepo;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;

public class AccountServiceImplTest {
AccountService accountService;
	
	@Mock
	AccountRepo accountRepository;
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		accountService = new AccountServiceImpl(accountRepository);
	}

	/*
	 * create account
	 * 1.when the amount is less than 500 then system should throw exception
	 * 2.when the valid info is passed account should be created successfully
	 */
	
	@Test(expected=com.capgemini.exceptions.InsufficientInitialAmountException.class)
	public void whenTheAmountIsLessThan500SystemShouldThrowException() throws InsufficientInitialAmountException
	{
		accountService.createAccount(101, 400);
	}
	
	@Test
	public void whenTheValidInfoIsPassedAccountShouldBeCreatedSuccessfully() throws InsufficientInitialAmountException
	{
		Account account =new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		when(accountRepository.save(account)).thenReturn(true);
		assertEquals(account, accountService.createAccount(101, 5000));
	}
	
	/*
	 * Withdraw amount
	 * 1. When withdrawal amount is greater than available account
	 * 2. When valid info passed withdraw account successfully
	 */
	
	@Test(expected=com.capgemini.exceptions.InsufficientBalanceException.class)
	public void whenTheWithdrawalAmountIsGreaterThanAvailableAccount() throws InsufficientBalanceException{		
		accountService.withdrawAmount(101, 6000);
	}
	
	@Test
	public void whenTheValidInfoPassedWithdrawAccountSuccessfully() throws InsufficientBalanceException{
		Account account= new Account();
		account.setAccountNumber(101);
		account.setAmount(2000);
		when(accountRepository.searchAccount(account.getAccountNumber())).thenReturn(account);
		assertEquals(account, accountService.withdrawAmount(101, 3000));

	}
	
	/*
	 * Deposit Amount
	 * 1. When amount is deposited successfully
	 */

	@Test
	public void whenAmountIsDepositedSuccessfully() throws InvalidAccountNumberException{
		Account account= new Account();
		account.setAccountNumber(101);
		account.setAmount(8000);
		when(accountRepository.searchAccount(account.getAccountNumber())).thenReturn(account);
		assertEquals(account, accountService.DepositAmount(101, 3000));

	}


}
