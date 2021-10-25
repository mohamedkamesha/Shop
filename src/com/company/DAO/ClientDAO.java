package com.company.DAO;

import com.company.model.Client;
import com.company.model.Company;
import com.company.model.Electronics;

import java.util.ArrayList;
import java.util.List;

public class ClientDAO {

    public static List<Client> clients = new ArrayList<>();

    public List<Client> getAll() {
        return clients;
    }


    public Client getById(Integer integer) {
        for(Client client : clients)
            if(client.getId() == integer )
                return client;
        return null;
    }

    public void add(Client client) {  clients.add(client); }

    public void delete( Integer integer) {
        for (Client electronics1 : clients){
            if(electronics1.getId() == integer){
                clients.remove(electronics1);
                break;
            }
        }
        //elect.add(client);
    }

    public void update(Client client,Integer integer) {
        for (Client client1 : clients){
            if(client1.getId() == integer){
                clients.remove(client1);
                break;
            }
        }
        clients.add(client);
    }



}
