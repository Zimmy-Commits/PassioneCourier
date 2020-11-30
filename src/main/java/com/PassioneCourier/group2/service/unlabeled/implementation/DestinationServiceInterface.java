package com.PassioneCourier.group2.service.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Destination;
import com.PassioneCourier.group2.service.IService;
import java.util.Set;


public interface DestinationServiceInterface extends IService<Destination, String> {
        Set<Destination> getAll();
    }
