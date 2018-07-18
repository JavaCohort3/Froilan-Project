package io.javacohort3.FarmerFroilan.classes;

import io.javacohort3.FarmerFroilan.interfaces.Rideable;
import io.javacohort3.FarmerFroilan.interfaces.Rider;

public class Pilot implements Rider {
    public void mount(Rideable rideable) {
        System.out.println("Pilot has mounted.");
    }

    public void dismount(Rideable rideable) {
        System.out.println("Pilot has dismounted.");
    }
}
