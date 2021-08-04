package com.springboot_Q5.springboot_Q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serviceclass {
	
	@Autowired
	private EmployeeRepository employeeRepository;	
	public List<Employee> returnAll()
	{   
		List<Employee> employee = new ArrayList<>();
		employeeRepository.findAll()
		.forEach(employee::add);
		return employee;
	}
	public Optional<Employee> getEmp(Long id)
	{
		return employeeRepository.findById(id);
	}
	public void addEmp(Employee emp)
	{
		employeeRepository.save(emp);
	}
	public void deleteEmp(Long id)
	{
		employeeRepository.deleteById(id);
	}
	public void updateEmp(Long id,Employee emp)
	{
		employeeRepository.save(emp);
	}

}