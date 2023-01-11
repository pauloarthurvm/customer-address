package com.paulo.customeraddress.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.paulo.customeraddress.utils.Constants.dtf;

@Data
public class Customer {
    private String ID;
    private String name;
    private int age;
    private String registrationDate;
    private String lastUpdateInfo;
    private List<Address> addressList;

    public Customer(String ID, String name, int age, Address address) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        LocalDateTime now = LocalDateTime.now();
        this.registrationDate = dtf.format(now);
        this.lastUpdateInfo= "Created customer: " + this.name;
        this.addressList = new ArrayList<>();
        addressList.add(address);
    }
}
