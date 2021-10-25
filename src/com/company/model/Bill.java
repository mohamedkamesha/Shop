package com.company.model;

import com.company.enums.Operatin;

import java.util.List;

public class Bill {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Client client;
    private List<Electronics> electronics;
    private  double total;
    private  String date;
    private  int amount;
    private  Operatin type;

    public Bill() {
    }

    public Bill(String date, int amount,String s ) {

        this.date = date;
        this.amount = amount;
        if (s.equals("sell"))
        this.type= Operatin.sell; //user
        else
        this.type =Operatin.pay;  //company

    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Electronics> getElectronics() {
        return electronics;
    }

    public void setElectronics(List<Electronics> electronics) {

        this.electronics = electronics;
    }

    public  void addElectronics (Electronics electronics){
        this.electronics.add(electronics);
        if (this.type.equals(Operatin.sell))
           this.total += electronics.getPrice_user();
        else
           this.total += electronics.getPrice_company();
    }
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + client +
                ", electronics=" + electronics +
                ", total=" + total +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}
