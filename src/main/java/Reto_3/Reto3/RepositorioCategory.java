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
public class RepositorioCategory {
    @Autowired
    private InterfaceCategory crudCategory;
    
    public List<Category> getAll(){
        return (List<Category>) crudCategory.findAll();
    }
    public Optional<Category> getCategory(int id){
        return crudCategory.findById(id);
    }
    public Category save(Category categoria){
        return crudCategory.save(categoria);
    }
    public void delete(Category categoria){
        crudCategory.delete(categoria);
    }
}
