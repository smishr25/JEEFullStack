package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;
import com.capgemini.exceptions.InvalidIdEnteredException;
import com.capgemini.exceptions.NameDoesNotExistException;
import com.capgemini.exceptions.NullValuePassedInAddressException;
import com.capgemini.exceptions.NullValuePassedInNameException;

public interface EmployeeService {
	
	Employee createEmployee(int id, String empName, Address address) throws NullValuePassedInNameException, InvalidIdEnteredException, NullValuePassedInAddressException;
	List<Employee> searchByName(String empName) throws NameDoesNotExistException, NullValuePassedInNameException;

}
