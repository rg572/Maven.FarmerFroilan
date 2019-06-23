package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Field {

    private static Field INSTANCE = new Field();

    private ArrayList<CropRow> cropRows;
    private int size;

    public Field() {
        cropRows.add(new CropRow<CornStalk>());
        cropRows.add(new CropRow<TomatoPlant>());
        cropRows.add(new CropRow<PotatoPlant>());
        cropRows.add(new CropRow<SoyPlant>());
        cropRows.add(new CropRow<OkraPlant>());
    }

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }
    
    public static Field getINSTANCE() {
        return INSTANCE;
    }

}
