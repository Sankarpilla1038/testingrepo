package com.psr.loggers.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.psr.loggers.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query("SELECT e.name, e.salary FROM Employee e WHERE e.empId= :id")
	Object[] findByIdForFew(@Param("id") Integer id);
	
		
		
	
     
}
