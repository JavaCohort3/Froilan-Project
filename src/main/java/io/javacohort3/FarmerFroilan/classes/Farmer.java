package io.javacohort3.FarmerFroilan.classes;


import io.javacohort3.FarmerFroilan.interfaces.Botanist;
import io.javacohort3.FarmerFroilan.interfaces.Person;
import io.javacohort3.FarmerFroilan.interfaces.Rider;
import io.javacohort3.FarmerFroilan.abstracts.Crop;
import io.javacohort3.FarmerFroilan.abstracts.Edible;
import io.javacohort3.FarmerFroilan.interfaces.Rideable;

public class Farmer implements Person, Rider, Botanist {

    public void eat(Edible edible ) {
        System.out.println("The Farmer eats " + edible);
    }

    public void mount(Rideable rideable) {
        System.out.println("The Farmer mounts on " + rideable);
    }

    public void dismount(Rideable rideable) {
        System.out.println("The Farmer dismounts on " + rideable);
    }

    public void plant(Crop crop) {
        System.out.println("The Farmer plants " + crop);
    }

    public void makeNosie() {
        System.out.println("The Farmer makes noise");
    }
}






