package com.paulo.customeraddress.model;

import lombok.Data;

import java.util.List;
import java.util.regex.Pattern;

@Data
public class Address {
    private String zipCode;
    private int number;
    private List<Customer> customerList;

    public Address(String zipCode, int number) throws Exception {
        if (validateZipCodeFormat(zipCode)) {
            this.zipCode = zipCode;
            this.number = number;
            System.out.println("Address created: " + zipCode);
            return;
        }
        throw new Exception("Zip Code not valid: " + zipCode);
    }

    private boolean validateZipCodeFormat(String zc) {
        String zipCodeRegex = "^\\d{5}-\\d{3}";
//        Pattern p = Pattern.compile("\\d\\d\\d\\d\\d-\\d\\d\\d");
        Pattern p = Pattern.compile(zipCodeRegex);
        return p.matcher(zc).matches();
    }
}
