package com.zipcodewilmington.froilansfarm;

public class OkraPlant extends Crop {
        protected Okra okra;

        public Edible yield() {
            if (this.getReadyForHarvest()) {
                this.setHasBeenFertilized(false);
                this.setReadyForHarvest(false);
                return okra;
            } else {return null;}
        }
    }
