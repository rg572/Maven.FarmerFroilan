package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Field<CropRow>{

    private ArrayList<CropRow> cropRows;

    public Field() {

    }
    public void plantRow(CropRow cropRow){
        cropRows.add(cropRow);
    }
}
