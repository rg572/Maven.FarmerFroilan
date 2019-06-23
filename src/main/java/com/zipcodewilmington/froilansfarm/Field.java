package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.HashMap;

public class Field {

    private static Field INSTANCE = new Field();

    private HashMap<String, CropRow> cropRows;

    private Field() {
        cropRows = new HashMap<String, CropRow>(5);
        cropRows.put("corn", new CropRow<CornStalk>());
        cropRows.put("tomato", new CropRow<TomatoPlant>());
        cropRows.put("potato", new CropRow<PotatoPlant>());
        cropRows.put("soy", new CropRow<SoyPlant>());
        cropRows.put("okra", new CropRow<OkraPlant>());
    }

    public HashMap<String, CropRow> getCropRows() {
        return cropRows;
    }

    public static Field getINSTANCE() {
        return INSTANCE;
    }
}
