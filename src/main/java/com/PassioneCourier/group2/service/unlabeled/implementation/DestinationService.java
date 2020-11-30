package com.PassioneCourier.group2.service.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Destination;
import com.PassioneCourier.group2.repository.unlabeled.implementation.DestinationRepository;
import java.util.Set;

public class DestinationService implements DestinationServiceInterface{

        private static DestinationServiceInterface destinationServiceInterface = null;
        private DestinationRepository servInterface;

      // private DestinationService(){
       //     this.servInterface = DestinationRepository.getDestinationRepository();
       // }

        public static DestinationServiceInterface getDestinationServiceInterface(){
            if (destinationServiceInterface == null) destinationServiceInterface = new DestinationService();
            return destinationServiceInterface;
        }

        @Override
        public Set<Destination> getAll() {
            return null;
        }

        @Override
        public Destination create(Destination t) {
            return this.servInterface.create(t);
        }

    @Override
    public Destination read(String myID) {
        return null;
    }

      /* @Override
       public Destination read(String myID) {
        return this.servInterface.read(myID);
        return null;
    } */

       @Override
        public Destination update(Destination t) {
            return this.servInterface.update(t);
        }

       @Override
        public boolean delete(Integer myID) {
            return this.servInterface.delete(myID);
           // return false;
        }

}
