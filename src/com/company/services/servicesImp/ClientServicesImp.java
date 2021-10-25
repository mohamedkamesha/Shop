package com.company.services.servicesImp;

import com.company.DAO.ClientDAO;
import com.company.DAO.ElectronicsDAO;
import com.company.model.Client;
import com.company.model.Company;
import com.company.model.Electronics;
import com.company.services.ClientServices;

import java.util.List;

public class ClientServicesImp implements ClientServices {

    ClientDAO cd;
    @Override
    public List<Client> getAll() {
        cd=new ClientDAO();
        return cd.getAll();
    }

    @Override
    public Client getById(Integer integer) {
        cd=new ClientDAO();
        return cd.getById(integer);
    }

    @Override
    public void add(Client client) {
        cd=new ClientDAO();
        cd.add(client);
    }

    @Override
    public void delete(Integer integer) {
        cd=new ClientDAO();
        cd.delete(integer);
    }

    @Override
    public void update(Client client, Integer integer) {
        cd=new ClientDAO();
        cd.update(client,integer);
    }
}
