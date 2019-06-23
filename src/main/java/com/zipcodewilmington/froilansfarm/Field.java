package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Field {

    private ArrayList<CropRow> cropRows;
    private int size;

    public Field() {
    }

    public void plantRow(CropRow cropRow){
        cropRows.add(cropRow);
    }

    public void harvestRow(CropRow cropRow) {
        cropRows.remove(cropRow);
    }

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }

    public void setCropRows(ArrayList<CropRow> cropRows) {
        this.cropRows = cropRows;
    }
}
