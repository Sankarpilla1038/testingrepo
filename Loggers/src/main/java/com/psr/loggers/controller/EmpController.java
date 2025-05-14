package com.psr.loggers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psr.loggers.entity.Employee;
import com.psr.loggers.service.EmpService;


//this is fourth change
//this third change to check
//hi bro this new chane to test sankar branch1
//hi shankar this your new change to test git
@RestController
@RequestMapping("/employees")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	
	@GetMapping("/gettingTestEmp")
	public ResponseEntity<Employee> adddEmp(){
		return new ResponseEntity<Employee>(new Employee(),HttpStatus.OK);
	}
	
	
	
	@PostMapping("/")
	public ResponseEntity<?> createEmp(@RequestBody Employee emp){
		
		return new ResponseEntity<Employee>(empService.saveEmp(emp),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployee(@PathVariable("id") Integer id){
		
		System.out.println("mnajskf"+id);
		return new ResponseEntity<Employee>(empService.getEmployee(id),HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		
		
		return new ResponseEntity<List<Employee>>(empService.getAllEmployees(),HttpStatus.OK);
	}
	//few details
	@GetMapping("/few/{id}")
	public Object[] getEmployeeFewDetails(@PathVariable("id") Integer id){
		
		System.out.println("anr doing"+id);
		return empService.getEmployeeFewDetails(id);
	}

}
