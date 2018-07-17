package io.javacohort3.FarmerFroilan.abstracts;

import io.javacohort3.FarmerFroilan.interfaces.Aircraft;
import io.javacohort3.FarmerFroilan.classes.CropRow;

public abstract class CropDuster implements Aircraft {
    public void fertilize(CropRow cropRow){
        this.cropRow = cropRow;
    }
}
