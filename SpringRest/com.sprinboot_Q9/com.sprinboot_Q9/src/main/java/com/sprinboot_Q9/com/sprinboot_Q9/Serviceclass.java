package com.sprinboot_Q9.com.sprinboot_Q9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serviceclass {
	
	@Autowired
	private CustomerRepository CustomerRepository;	
	public List<Customer> returnAll()
	{   
		List<Customer> Customer = new ArrayList<>();
		CustomerRepository.findAll()
		.forEach(Customer::add);
		return Customer;
	}
	public Optional<Customer> getCus(Long id)
	{
		return CustomerRepository.findById(id);
	}
	public void addCus(Customer Cus)
	{
		CustomerRepository.save(Cus);
	}
	public void deleteCus(Long id)
	{
		CustomerRepository.deleteById(id);
	}
	public void updateCus(Long id,Customer Cus)
	{
		CustomerRepository.save(Cus);
	}

}