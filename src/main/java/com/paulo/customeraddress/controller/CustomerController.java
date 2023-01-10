package com.paulo.customeraddress.controller;

import com.paulo.customeraddress.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.paulo.customeraddress.CustomerAddressApplication.customers;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping()
    public List<Customer> getCustomer() {
        System.out.println("/GET endpoint");
        return customers;
    }

}
