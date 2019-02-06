package com.capgemini.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.capgemini.beans.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {
	Map<Integer, Employee> employees = new HashMap<>();

	public boolean save(Employee e) {
		if (employees.containsKey(e.getId())) {
			return false;
		}

		employees.put(e.getId(), e);
		return true;
	}

	public List<Employee> findByName(String empName) {
		List<Employee> list = new ArrayList<>();

		for (Entry<Integer, Employee> entry : employees.entrySet()) {

			if (entry.getValue().getEmpName().equals(empName)) {
				list.add(entry.getValue());
			}
		}

		return list;
	}

}
