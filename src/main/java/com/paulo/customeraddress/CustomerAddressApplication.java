package com.paulo.customeraddress;

import com.paulo.customeraddress.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class CustomerAddressApplication {

	public static List<Customer> customers;

	public static void main(String[] args) {
		SpringApplication.run(CustomerAddressApplication.class, args);
		customers = new ArrayList<>();
		customers.add(new Customer(UUID.randomUUID().toString(), "John Lock", 30));
		customers.add(new Customer(UUID.randomUUID().toString(), "Marie Curie", 55));
		customers.add(new Customer(UUID.randomUUID().toString(), "Tom Brady", 42));
		customers.add(new Customer(UUID.randomUUID().toString(), "Tom Cruise", 65));
	}

}
