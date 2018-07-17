package io.javacohort3.FarmerFroilan.abstracts;

import io.javacohort3.FarmerFroilan.interfaces.Aircraft;
import io.javacohort3.FarmerFroilan.storage.CropRow;

public abstract class CropDuster implements Aircraft {

    private CropRow cropRow;

    public void fertilize(CropRow cropRow){
        this.cropRow = cropRow;
    }
}
