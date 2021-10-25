package com.company.model;

import java.io.Serializable;

public class Company extends Client    {

    public Company() {
    }

    public Company(int id, String name, String address, String phone) {
        super(id, name, address, phone);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
