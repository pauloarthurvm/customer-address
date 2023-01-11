package com.paulo.customeraddress;

import com.paulo.customeraddress.model.Address;
import com.paulo.customeraddress.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class CustomerAddressApplication {

	public static List<Customer> customers;
	public static List<Address> addresses;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CustomerAddressApplication.class, args);
		customers = new ArrayList<>();
		addresses = new ArrayList<>();
		addresses.add(new Address("99999-999", 10));
		addresses.add(new Address("78998-111", 987));
		addresses.add(new Address("26587-654", 55));
		customers.add(new Customer(UUID.randomUUID().toString(), "John Lock", 30, addresses.get(0)));
		customers.add(new Customer(UUID.randomUUID().toString(), "Marie Curie", 55, addresses.get(1)));
		customers.add(new Customer(UUID.randomUUID().toString(), "Tom Brady", 42, addresses.get(2)));
		customers.add(new Customer(UUID.randomUUID().toString(), "Tom Cruise", 65, addresses.get(0)));
	}

}
