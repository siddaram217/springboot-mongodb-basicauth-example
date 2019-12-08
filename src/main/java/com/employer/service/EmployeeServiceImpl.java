package com.employer.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employer.model.Employee;
import com.employer.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	 /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#createEmployee(java.util.List)
     */
    @Override
    public void createEmployee(List<Employee> emp) {
        repository.saveAll(emp);
    }
 
    /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#getAllEmployees()
     */
    @Override
    public Collection<Employee> getAllEmployees() {
        return repository.findAll();
    }
 
    /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#findEmployeeById(int)
     */
    @Override
    public Optional<Employee> findEmployeeById(Integer id) {
        return repository.findById(id);
    }
 
    /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#deleteEmployeeById(int)
     */
    @Override
    public void deleteEmployeeById(Integer id) {
        repository.deleteById(id);
    }
 
    /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#updateEmployee(int)
     */
    @Override
    public void updateEmployee(Employee emp) {
        repository.save(emp);
    }
 
    /* (non-Javadoc)
     * @see com.assignment.springboot.mongo.service.Employeeservice#deleteAllEmployees()
     */
    @Override
    public void deleteAllEmployees() {
        repository.deleteAll();
    }
	
}
