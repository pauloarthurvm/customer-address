package com.paulo.customeraddress.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Customer {
    private String ID;
    private String name;
    private int age;
    private Date registrationDate;
    private Date lastUpdateInfo;
    private List<Address> addressList;

    public Customer(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }
}
