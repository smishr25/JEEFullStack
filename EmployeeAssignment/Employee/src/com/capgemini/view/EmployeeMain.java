package com.capgemini.view;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.exceptions.InvalidIdEnteredException;
import com.capgemini.exceptions.NameDoesNotExistException;
import com.capgemini.exceptions.NullValuePassedInNameException;
import com.capgemini.repo.EmployeeRepoImpl;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {

		/*EmployeeRepoImpl employeeRepo = new EmployeeRepoImpl();

		EmployeeService service = new EmployeeServiceImpl(employeeRepo);
		service.createEmployee(101, "Sushil", new Address(new Country("India", new City("Hathras")), "ABC"));*/

		/*
		 * try { System.out.println(service.createEmployee(101, "Sushil", new
		 * Address(new Country("India", new City("Hathras")), "ABC")));
		 * 
		 * System.out.println(service.createEmployee(102, "Suraj", new Address(new
		 * Country("India", new City("Mathura")), "PQR")));
		 * 
		 * 
		 * service.createEmployee(103, "Chirag", new Address(new Country("India", new
		 * City("Agra")), "XYZ")));
		 * 
		 * //System.out.println(service.createEmployee(104, null, new Address(new
		 * Country("India", new City("Agra")), "XYZ")));
		 * 
		 * System.out.println("\nSEARCH RESULTS");
		 * 
		 * System.out.println(service.searchByName("Sushil"));
		 * System.out.println(service.searchByName("aa"));
		 * System.out.println(service.searchByName("Suraj")); } catch
		 * (NullValuePassedInNameException ne) {
		 * System.out.println("Null Passed In Employee Detail : " + ne);
		 * 
		 * } catch (NameDoesNotExistException nde) {
		 * System.out.println("Null Passed In Name Field : " + nde);
		 * 
		 * } catch (InvalidIdEnteredException ide) {
		 * System.out.println("Inavlid ID Entered in Employee Detail : " + ide);
		 * 
		 * } catch (NullValuePassedInAddressException nade) {
		 * System.out.println("Inavlid ID Entered in Employee Detail : " + nade);
		 * 
		 * }
		 */

	}

}
