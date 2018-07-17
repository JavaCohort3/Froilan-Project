package io.javacohort3.FarmerFroilan.storage;

import io.javacohort3.FarmerFroilan.abstracts.Crop;

public class CropRow {
    private Crop crop;

    public CropRow() {
    }

    public CropRow(Crop crop) {
        this.crop = crop;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    @Override
    public String toString() {
        return "CropRow{" +
                "crop=" + crop +
                '}';
    }
}
