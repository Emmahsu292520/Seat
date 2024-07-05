package com.employee.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	public EmployeeVO getOneEmp(Integer empId) {
		Optional<EmployeeVO> optional = employeeRepository.findById(empId);
		return optional.orElse(null);
	}
	
	
	public void addEmp(EmployeeVO employee) {
		employeeRepository.save(employee);
	}
	
	
	public void updateEmp(EmployeeVO employee) {
		employeeRepository.save(employee);
	}
}
  