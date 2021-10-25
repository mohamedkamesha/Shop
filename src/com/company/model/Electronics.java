package com.company.model;

import java.io.Serializable;
import java.util.List;

public class Electronics  implements Serializable {
    private  int id;
    private  String name;
    private  String type;
    private  int amount;
    private  double price_company;
    private  double price_user;
    private  String date;
    private  Company company;

    public Electronics() {
    }

    public Electronics(int id, String name, String type, int amount, double price_company, double price_user, String date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.price_company = price_company;
        this.price_user = price_user;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice_company() {
        return price_company;
    }

    public void setPrice_company(double price_company) {
        this.price_company = price_company;
    }

    public double getPrice_user() {
        return price_user;
    }

    public void setPrice_user(double price_user) {
        this.price_user = price_user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", price_company=" + price_company +
                ", price_user=" + price_user +
                ", date='" + date + '\'' +
                ", company=" + company.toString() +
                '}';
    }
}
