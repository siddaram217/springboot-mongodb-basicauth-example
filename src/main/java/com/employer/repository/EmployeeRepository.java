package com.employer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employer.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

}
