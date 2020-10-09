package com.PassioneCourier.group2.service.tool.implementation;

import com.PassioneCourier.group2.Entity.tool.Vehicle;
import com.PassioneCourier.group2.repository.tool.implementation.VehicleRepository;
import com.PassioneCourier.group2.repository.tool.implementation.VehicleRepositoryInterface;

import java.util.Set;

public class VehicleService implements VehicleServiceInterface {

    public static VehicleServiceInterface vehicleServiceInterface = null;
    private VehicleRepositoryInterface vehicleRepositoryInter;

    private VehicleService() {
        this.vehicleRepositoryInter = VehicleRepository.getVehicleRepositoryInter();
    }

    public static VehicleServiceInterface getVehicleService(){
        if(vehicleServiceInterface == null){
            vehicleServiceInterface = new VehicleService();
        }
        return vehicleServiceInterface;
    }


    @Override
    public Set<Vehicle> getAll() {
        return null;
    }
}
