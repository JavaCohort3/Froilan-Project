package io.javacohort3.FarmerFroilan.abstracts;

import io.javacohort3.FarmerFroilan.abstracts.Crop;
import io.javacohort3.FarmerFroilan.interfaces.FarmVehicle;

public abstract class Tractor implements FarmVehicle {

    private Crop harvest;

    public void harvest(Crop crop){
      this.harvest = harvest;
    }
}
