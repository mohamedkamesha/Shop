package com.company.DAO;

import com.company.model.Bill;
import com.company.model.Client;

import java.util.ArrayList;
import java.util.List;

public class BillDAO {



    public static List<Bill> bills = new ArrayList<>();

    public List<Bill> getAll() {
        return bills;
    }


    public Bill getById(Integer integer) {
        for(Bill bill : bills)
            if(bill.getId() == integer )
                return bill;
        return null;
    }

    public void add(Bill bill) {  bills.add(bill); }

    public void delete( Integer integer) {
        for (Bill bill : bills){
            if(bill.getId() == integer){
                bills.remove(bill);
                break;
            }
        }
        //elect.add(client);
    }

    public void update(Bill bill,Integer integer) {
            for (Bill bill1 : bills){
            if(bill1.getId() == integer){
                bills.remove(bill1);
                break;
            }
        }
        bills.add(bill);
    }




}
