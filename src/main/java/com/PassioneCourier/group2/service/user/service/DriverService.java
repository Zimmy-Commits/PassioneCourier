package com.PassioneCourier.group2.service.user.service;

import com.PassioneCourier.group2.Entity.user.Driver;
import com.PassioneCourier.group2.repository.user.DriverRepositoryInterface;
import com.PassioneCourier.group2.service.user.DriverServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DriverService implements DriverServiceInterface {
    public static DriverServiceInterface service = null;
    @Autowired
    private DriverRepositoryInterface repo;

    /* public DriverService(){
         this.repo = DriverRepository.getRepo();
     }

     public static DriverServiceInterface getService(){
         if(service==null){
             service = new DriverService();

         }
         return service;
     }*/
    @Override
    public Set<Driver> getAll() {
        return this.repo.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Driver create(Driver t) {
        return this.repo.save(t);
    }

    @Override
    /*public Driver read(Integer myID) {
        return null;
    }*/



    public Driver read(String myID) {
        return this.repo.findById(myID).orElseGet(null);
    }

    @Override
    public Driver update(Driver t) {
        return this.repo.save(t);
    }

    @Override
    public boolean delete(String myID) {
        this.repo.deleteById(myID);
        if (this.repo.existsById(myID))
            return false;
        else return true;


    }
}