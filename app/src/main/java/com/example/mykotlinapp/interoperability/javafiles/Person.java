package com.example.mykotlinapp.interoperability.javafiles;

import com.example.mykotlinapp.interoperability.ktfiles.Company;
import com.example.mykotlinapp.interoperability.ktfiles.CompanyKt;
/*
 * Interoperability Java classs
 *
 * */

public class Person {
    int _id;
    String name;

    public Person(int _id, String name) {
        this._id = _id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Company newCompany = new Company("Robo", 500);
        newCompany.getTheCompanyName();
        CompanyKt.setVehicleSpecification("jeep");
    }
}


