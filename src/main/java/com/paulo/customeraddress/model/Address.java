package com.paulo.customeraddress.model;

import lombok.Data;

import java.util.List;

@Data
public class Address {
    private String zipCode;
    private int number;
    private List<Customer> customerList;
}
