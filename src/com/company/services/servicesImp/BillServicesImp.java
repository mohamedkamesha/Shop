package com.company.services.servicesImp;

import com.company.DAO.BillDAO;
import com.company.DAO.ClientDAO;
import com.company.model.Bill;
import com.company.services.BillServices;
import com.company.services.ClientServices;

import java.util.List;

public class BillServicesImp implements BillServices {
    BillDAO bd;
    @Override
    public List<Bill> getAll() {
        bd=new BillDAO();
        return bd.getAll();
    }

    @Override
    public Bill getById(Integer integer) {
        bd=new BillDAO();
        return bd.getById(integer);
    }

    @Override
    public void add(Bill bill) {
        bd=new BillDAO();
        ClientServices cd=new ClientServicesImp();
        if(cd.getById(bill.getClient().getId())==null)
            cd.add(bill.getClient());
        bd.add(bill);
    }

    @Override
    public void delete(Integer integer) {
        bd=new BillDAO();
        bd.delete(integer);
    }

    @Override
    public void update(Bill bill, Integer integer) {
        bd=new BillDAO();
        bd.update(bill,integer);
    }
}
