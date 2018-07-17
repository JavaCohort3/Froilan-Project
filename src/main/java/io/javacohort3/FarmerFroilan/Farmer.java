package io.javacohort3.FarmerFroilan;



public class Farmer implements Person, Rider, Botanist{

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
}






