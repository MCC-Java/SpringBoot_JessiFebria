/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.crud.services;

import com.mcc.crud.entities.Region;
import com.mcc.crud.repositories.RegionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JESSI
 */
@Service
public class RegionServices {
    @Autowired
    RegionRepository regionrepository;
    
    //read
    public List<Region> getAll(){
        return regionrepository.findAll();
    }
    //create / update bisa semua
    public void save(Region region){
        regionrepository.save(region);
    }
    //delete
    public void delete(Integer id){
        regionrepository.delete(new Region(id));
    }
    
    public Optional<Region> findbyid(Integer id){
        return regionrepository.findById(id);
    }
    
}
