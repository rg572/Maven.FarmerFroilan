package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow<T extends Crop> {
    ArrayList<T> cropRow;

    public CropRow() {
        this.cropRow = new ArrayList<T>();
    }

    public void addCrop(T t) {
        cropRow.add(t);
    }

    public void removeCrop(T t) {
        cropRow.removeAll(cropRow);

    }

    public void fertilizeCrops() {
        for (Crop crop : cropRow) crop.hasBeenFertilized = true;
    }

    public ArrayList<T> getCropRow() {
        return cropRow;
    }

}
