package classes;

import interfaces.Aircraft;

public abstract class CropDuster implements Aircraft {
    public void fertilize(CropRow cropRow){
        this.cropRow = cropRow;
    }
}
