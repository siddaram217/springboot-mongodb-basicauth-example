package com.employer.model;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 
// Mongo database annotation.
@Document(collection= "employee")
public class Employee {
 
    @Id
    private Integer id;
    
    @Size(max=50)
    private String name;
    
    @Size(max=50)
    private String companyName;
    
    @Size(max=50)
    private String jobTitle;
    
    @Size(max=50)
    private String jobLocation;
    
    @Size(max=50)
    private Integer jobSalary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public Integer getJobSalary() {
		return jobSalary;
	}

	public void setJobSalary(Integer jobSalary) {
		this.jobSalary = jobSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", companyName=" + companyName + ", jobTitle=" + jobTitle
				+ ", jobLocation=" + jobLocation + ", jobSalary=" + jobSalary + "]";
	}
}
