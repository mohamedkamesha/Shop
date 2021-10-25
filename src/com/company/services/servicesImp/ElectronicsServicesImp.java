package com.company.services.servicesImp;

import com.company.DAO.ElectronicsDAO;
import com.company.model.Company;
import com.company.model.Electronics;
import com.company.services.ElectronicsServices;

import java.util.List;

public class ElectronicsServicesImp implements ElectronicsServices {

    private ElectronicsDAO ed ;

    @Override
    public List<Electronics> getAll() {
        ed=new ElectronicsDAO();
        return ed.getAll();
    }

    @Override
    public Electronics getByInfo(Company company) {
        ed=new ElectronicsDAO();
        return ed.getByInfo(company);
    }

    @Override
    public Electronics getById(Integer integer) {
        ed=new ElectronicsDAO();
        return ed.getById(integer);
    }

    @Override
    public void add(Electronics electronics) {
        ed=new ElectronicsDAO();
         ed.add(electronics);
    }

    @Override
    public void delete( Integer integer) {
        ed=new ElectronicsDAO();
        ed.delete( integer);
    }

    @Override
    public void update(Electronics electronics,Integer integer) {
        ed=new ElectronicsDAO();
        ed.update(electronics,integer);
    }
}
