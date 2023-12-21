package com.bridgelabz.opencsv;

import com.opencsv.bean.CsvBindByName;

// POJO class for reading CSV directly
public class CSVUser {

    @CsvBindByName
    private String name;
    @CsvBindByName (column = "email", required = true)
    private String email;
    @CsvBindByName(column = "phoneNo")
    private String phoneNo;
    @CsvBindByName
    private String country;

    public CSVUser(String name, String email, String phoneNo, String country) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.country = country;
    }

    @Override
    public String toString() {
        return "CSVUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getCountry() {
        return country;
    }
}
