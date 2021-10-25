package com.company.DAO;

import com.company.model.Company;
import com.company.model.Electronics;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsDAO {
    public static List<Electronics> elect = new ArrayList<>();

    public List<Electronics> getAll() {
        return elect;
    }

    public Electronics getByInfo(Company company) {
        for (Electronics electronics : elect)
            if (electronics.getCompany().getId()==company.getId())
                return electronics;
        return null;
    }

    public Electronics getById(Integer integer) {
        for(Electronics electronics : elect)
            if(electronics.getId() == integer )
                return electronics;
        return null;
    }

    public void add(Electronics electronics) {  elect.add(electronics); }

    public void delete( Integer integer) {
        for (Electronics electronics1 : elect){
            if(electronics1.getId() == integer){
                elect.remove(electronics1);
                break;
            }
        }
        //elect.add(electronics);
    }

    public void update(Electronics electronics,Integer integer) {
        delete(integer);
        elect.add(electronics);
    }

}
