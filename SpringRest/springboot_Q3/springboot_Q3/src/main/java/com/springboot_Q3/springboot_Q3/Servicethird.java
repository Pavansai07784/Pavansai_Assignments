package com.springboot_Q3.springboot_Q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Servicethird {
	
	List<Details> list=new ArrayList<>(Arrays.asList(
			new Details("Telangana","Hyderabad","Ind",36546),
			new Details("Georgia","Tallahassee","Usa",78562),
			new Details("New South Wales","Sydney","Aus",68452),
			new Details("Kerala","Thiruvananthapuram","Ind",36545)
			));
	public Details getDetails(Integer id)
	{
		return list.stream().filter(t->t.getZip().equals(id)).findFirst().get();
	
   }
	

}