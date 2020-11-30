package com.PassioneCourier.group2.repository.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Destination;
import com.PassioneCourier.group2.repository.IRepository;

import java.util.Set;

public interface DestinationRepositoryInterface extends IRepository<Destination, Integer> {
    Set<Destination> getAll();

    Destination read(String myID);
}