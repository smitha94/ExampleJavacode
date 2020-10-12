package com.company;

public interface Edible {
    public int getEaten();

    public default int getNutrients(){
        return 0;
    }

}
