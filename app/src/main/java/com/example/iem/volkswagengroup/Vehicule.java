package com.example.iem.volkswagengroup;

import java.util.Date;

/**
 * Created by iem on 19/10/2016.
 */

class Vehicule {


    //region VARIABLES

    protected String type;
    protected int nbwheels;
    protected String model;


    //endregion


    //region CONSTRUCTOR


    public Vehicule(String type, int nbwheels, String model) {
        this.type = type;
        this.nbwheels = nbwheels;
        this.model = model;
    }



    //endregion


    //region GET SET


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNbwheels() {
        return nbwheels;
    }

    public void setNbwheels(int nbwheels) {
        this.nbwheels = nbwheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //endregion



}
