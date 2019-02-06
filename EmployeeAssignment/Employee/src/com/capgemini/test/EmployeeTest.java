package com.capgemini.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.beans.Employee;
import com.capgemini.exceptions.InvalidIdEnteredException;
import com.capgemini.exceptions.NameDoesNotExistException;
import com.capgemini.exceptions.NullValuePassedInAddressException;
import com.capgemini.exceptions.NullValuePassedInNameException;
import com.capgemini.repo.EmployeeRepo;
import com.capgemini.repo.EmployeeRepoImpl;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.EmployeeServiceImpl;

public class EmployeeTest {

	EmployeeService employeeService;

	@Mock
	EmployeeRepo employeeRepo;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

		employeeService = new EmployeeServiceImpl(employeeRepo);
	}

	/*
	 * Create Employee 1. Null Passed in Name Exception 2. Null Passed in Address
	 * Exception 3. Duplicate Id Passed Exception 4. Null passed in Id Exception 5.
	 * When Valid Info passed create Employee Successfully
	 */

	/*@Test(expected = com.capgemini.exceptions.NullValuePassedInNameException.class)
	public void whenNullisPassedInNameThrowException() throws NullValuePassedInNameException, InvalidIdEnteredException, NullValuePassedInAddressException {
		EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
		EmployeeService service = new EmployeeServiceImpl(employeeRepo);
		service.createEmployee(101, null, new Address(new Country("India", new City("Agra")), "XYZ"));
	}
	
	@Test(expected = com.capgemini.exceptions.NullValuePassedInAddressException.class)
	public void whenNullisPassedInAddressThrowException() throws NullValuePassedInAddressException, InvalidIdEnteredException, NullValuePassedInNameException {
		EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
		EmployeeService service = new EmployeeServiceImpl(employeeRepo);
		service.createEmployee(101, "Sushil", new Address(new Country(null, new City("Agra")), "XYZ"));
	}*/
	
	/*@Test
	public void whenTheValidInfoIsPassedEmployeeShouldBeCreatedSuccessfully() throws NullValuePassedInAddressException, InvalidIdEnteredException, NullValuePassedInNameException {
		EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
		EmployeeService service = new EmployeeServiceImpl(employeeRepo);
		City city = new City();
		city.setCityName("Agra"); 
		Country country= new Country("India",city);
		Address address = new Address(country,"PQR");
		Employee employee= new Employee(address,101,"Sushil");
		when(employeeRepo.save(employee)).thenReturn(true);
		assertEquals(employee,service.createEmployee(101, "Sushil", new Address(new Country("India", new City("Agra")), "PQR")));
	}*/
	
	/*@Test(expected = com.capgemini.exceptions.InvalidIdEnteredException.class)
	public void whenDuplicateIdIsPassedThrowException() throws NullValuePassedInAddressException, InvalidIdEnteredException, NullValuePassedInNameException {
		EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
		EmployeeService service = new EmployeeServiceImpl(employeeRepo);
		
		service.createEmployee(101, "Sushil", new Address(new Country("India", new City("Agra")), "XYZ"));
	}*/
	
	
	/*
	 * Search By Name Employee 1. Null Passed in Name Exception 
	 *  2. Wrong Name passed Exception 
	 *  3. When Valid Info passed search Employee Successfully
	 */
	
	/*@Test(expected = com.capgemini.exceptions.NullValuePassedInNameException.class)
	public void whenNullisSearchPassedInNameThrowException() throws NullValuePassedInNameException, NameDoesNotExistException {
		EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
		EmployeeService service = new EmployeeServiceImpl(employeeRepo);
		service.searchByName(null);
	}*/
	
	@Test(expected = com.capgemini.exceptions.NameDoesNotExistException.class)
	public void whenDifferentNameisPassedInSearchNameThrowException() throws NullValuePassedInAddressException, NullValuePassedInNameException, NameDoesNotExistException, InvalidIdEnteredException {
		EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();
		EmployeeService service = new EmployeeServiceImpl(employeeRepo);
		service.searchByName("1as56a");
	}

}
