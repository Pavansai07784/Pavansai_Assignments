package com.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ram.config.RabbitMQConfiguration;
import com.ram.model.Product;

@SpringBootApplication
public class Application implements CommandLineRunner
{

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) throws InterruptedException
	{
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "desktop", 1000));
		products.add(new Product(2, "laptop", 526));
		products.add(new Product(3, "mouse", 856));
		products.add(new Product(4, "keyboard", 654));
		products.add(new Product(5, "router", 456));
		products.add(new Product(6, "Ethernet Cable", 785));
		products.add(new Product(7, "memory card", 963));
		products.add(new Product(8, "hard disk", 745));
		products.add(new Product(9, "cd", 456));
		products.add(new Product(10, "ryzen", 645));
		
		products.stream()
		.filter(n->n.getQuantity()< 10)
		.forEach(n -> rabbitTemplate.convertAndSend(RabbitMQConfiguration.fanoutExchangeName,
				"", products));
		
		System.out.println("Message sent successfully...");
	}

}