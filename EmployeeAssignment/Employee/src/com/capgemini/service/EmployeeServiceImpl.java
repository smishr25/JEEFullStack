package com.capgemini.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.beans.Employee;
import com.capgemini.exceptions.InvalidIdEnteredException;
import com.capgemini.exceptions.NameDoesNotExistException;
import com.capgemini.exceptions.NullValuePassedInAddressException;
import com.capgemini.exceptions.NullValuePassedInNameException;
import com.capgemini.repo.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo employeeRepo;
	Map<Integer, Employee> employees = new HashMap<>();


	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	@Override
	public Employee createEmployee(int id, String empName, Address address) throws NullValuePassedInNameException, InvalidIdEnteredException, NullValuePassedInAddressException {
		Country country= new Country();
		City city=new City();
		if(empName==null) {

			throw new NullValuePassedInNameException();

		}
		if(address.getAddressLine()==null||country.getCountryName()==null||city.getCityName()==null) {

			throw new NullValuePassedInAddressException();

		}

		
		/*for(Map.Entry<Integer,Employee> emp : employees.entrySet() ) {
			System.out.println(emp.getKey());
			if(emp.getKey()==id) {
				System.out.println("LOLOLO");
				throw new InvalidIdEnteredException();
			}
			
		}*/
		Employee employee = new Employee(address, id, empName);

		if (employeeRepo.save(employee)) {
			return employee;
		} else {
			throw new InvalidIdEnteredException();
		}
	}

	@Override
	public List<Employee> searchByName(String empName) throws NameDoesNotExistException, NullValuePassedInNameException {
		if(empName==null) {

			throw new NullValuePassedInNameException();
		}
		if(employeeRepo.findByName(empName)==null) {
			
			throw new NameDoesNotExistException();
		}

		return employeeRepo.findByName(empName);

	}

}
