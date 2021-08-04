package com.sprinboot_Q9.com.sprinboot_Q9;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

	@Autowired 
	Serviceclass service;
	
	@RequestMapping("/all")
	public List<Customer> returnAll()
	{
		return service.returnAll();
	}
	@RequestMapping("/all/{id}")
	public Optional<Customer> getCus(@PathVariable Long id)
	{
		return service.getCus(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/all")
	public void addCus(@RequestBody Customer Cus)
	{
		service.addCus(Cus);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/all/{id}")
	public void deleteCus(@PathVariable Long id)
	{
		service.deleteCus(id);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/all/{id}")
	public void updateCus(@RequestBody Customer Cus,@PathVariable Long id)
	{
		service.updateCus(id, Cus);
	}
	
	
}
