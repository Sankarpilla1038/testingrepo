package com.psr.loggers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psr.loggers.entity.Employee;
import com.psr.loggers.repo.EmployeeRepo;

@Service
public class EmpService {

	@Autowired
	private EmployeeRepo empRepo;
	
	public Employee saveEmp(Employee emp) {
		
		return empRepo.save(emp);
	}
	

	public Employee saveShankar(Employee emp) {
		
		return empRepo.save(emp);
	}
	
	
   public Employee getEmployee(int id) {
		
		return empRepo.findById(id).get();
	}

public List<Employee> getAllEmployees() {
	// TODO Auto-generated method stub
	return empRepo.findAll();
}
public Object[] getEmployeeFewDetails(Integer id) {
	
	 Object[] employeeDetails = empRepo.findByIdForFew(id);
	 // Optionally, handle the case when no employee is found
    if (employeeDetails == null || employeeDetails.length == 0) {
        // Handle the case where no data is found, if necessary
        return new Object[]{};  // Or return null if preferred
    }

    return employeeDetails;
}
	
}
	
	

