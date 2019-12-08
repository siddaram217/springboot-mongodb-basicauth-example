package com.employer.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.employer.model.Employee;

public interface EmployeeService {

	void createEmployee(List<Employee> emp);

	Collection<Employee> getAllEmployees();

	Optional<Employee> findEmployeeById(Integer id);

	void deleteEmployeeById(Integer id);

	void updateEmployee(Employee emp);

	void deleteAllEmployees();

}
