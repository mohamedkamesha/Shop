package com.company;

import com.company.DAO.ElectronicsDAO;
import com.company.file.TextFile;
import com.company.model.Client;
import com.company.model.Company;
import com.company.model.Electronics;
import com.company.services.ClientServices;
import com.company.services.ElectronicsServices;
import com.company.services.servicesImp.ClientServicesImp;
import com.company.services.servicesImp.ElectronicsServicesImp;

public class Main {

    public static void main(String[] args) {


        Electronics electronics =new Electronics(1,"venous","lamp",200,7,10,"11/9/2021");
        Company com=new Company(1,"venous","cairo-altahreer","01022082384");
        electronics.setCompany(com);

        ElectronicsServices electronicsServices =new ElectronicsServicesImp() ;
        electronicsServices.add(electronics);

         electronics =new Electronics(2,"king","led",100,15,20,"18/9/2021");
         com=new Company(2,"king","alex","01113834965");
         electronics.setCompany(com);
         electronicsServices.add(electronics);

        electronics =new Electronics(3,"xx","cc",1,2,3,"18/9/2021");
        com=new Company(2,"king","alex","01113834965");
        electronics.setCompany(com);
        electronicsServices.add(electronics);


        electronics =new Electronics(1,"tt","t",10,20,30,"18/9/2021");
        com=new Company(2,"king","alex","01113834965");
        electronics.setCompany(com);

        for (Electronics electronics1 : electronicsServices.getAll()) {
            System.out.println(electronics1.toString());
        }

         electronicsServices.update(electronics ,1);
        for (Electronics electronics1 : electronicsServices.getAll()) {
            System.out.println("result\n"+electronics1.toString());
        }
         /*
        electronicsServices.update(electronics,3);
        for (Electronics electronics1 : electronicsServices.getAll()) {
            System.out.println("result\n"+electronics1.toString());
        }


        /*
        ClientServices clientServices =new ClientServicesImp();
        Client c=new Client(1,"venous","alex","010");
        clientServices.add(c);
        c=new Client(2,"xx","vvv","011");
        clientServices.add(c);

        c=new Client(3,"ttt","ooo","o15");
        clientServices.add(c);

      //  System.out.println(clientServices.getById(1).toString());

        //clientServices.delete(3);
        for (Client client : clientServices.getAll()) {
            System.out.println("result\n"+client.toString());
        }

        c=new Client(1,"123","123","123");
        System.out.println("\n");
        clientServices.update(c,1);

        for (Client client : clientServices.getAll()) {
            System.out.println("result\n"+client.toString());
        }


         */



    }
}
