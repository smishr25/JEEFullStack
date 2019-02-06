package com.capgemini.repo;

import java.util.List;

import com.capgemini.beans.Employee;

public interface EmployeeRepo {

	boolean save(Employee e);

	List<Employee> findByName(String empName);

}
