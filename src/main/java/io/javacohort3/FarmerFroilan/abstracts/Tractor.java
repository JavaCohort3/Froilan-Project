package io.javacohort3.FarmerFroilan.abstracts;

import io.javacohort3.FarmerFroilan.abstracts.Crop;
import io.javacohort3.FarmerFroilan.interfaces.FarmVehicle;

public abstract class Tractor implements FarmVehicle {

    private Crop crop;

    public void harvest(Crop crop){
      this.crop = crop;
    }
}
