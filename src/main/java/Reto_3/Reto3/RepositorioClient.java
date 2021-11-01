/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto_3.Reto3;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author drago
 */
@Repository
public class RepositorioClient {
    @Autowired
    private InterfaceClient crudClient;
    
    public List<Client> getAll(){
        return (List<Client>) crudClient.findAll();
    }
    public Optional<Client> getClient(int id){
        return crudClient.findById(id);
    }
    public Client save(Client client){
        return crudClient.save(client);
    }
    public void delete(Client client){
        crudClient.delete(client);
    }
}
