package io.javacohort3.FarmerFroilan.abstracts;

import io.javacohort3.FarmerFroilan.interfaces.FarmVehicle;

public abstract class Tractor implements FarmVehicle {
    
    public void harvest(Crop crop){
        System.out.println("Harvested Crops " + crop);
    }

    @Override
    public String toString() {
        return "Tractor{}";
    }
}
