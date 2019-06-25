package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Field {

    private static Field INSTANCE = new Field();

    private HashMap<String, CropRow> cropRows;

    private Field() {
        cropRows = new HashMap(5);
        cropRows.put("corn", new CropRow<CornStalk>());
        cropRows.put("tomato", new CropRow<TomatoPlant>());
        cropRows.put("potato", new CropRow<PotatoPlant>());
        cropRows.put("soy", new CropRow<SoyPlant>());
        cropRows.put("okra", new CropRow<OkraPlant>());

    }

    public Collection<CropRow> getCropRows() {
        return cropRows.values();
    }




    public static Field getINSTANCE() {
        return INSTANCE;
    }

    public HashMap<String, CropRow> getMap() {
        return cropRows;
    }

}
