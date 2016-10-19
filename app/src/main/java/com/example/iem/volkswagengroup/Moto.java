package com.example.iem.volkswagengroup;

/**
 * Created by iem on 19/10/2016.
 */


class Moto extends Vehicule{



    //region VARIABLES

    protected int enginepower;
    protected String style;

    //endregion


    //region CONSTRUCTOR

    public Moto(String type, int nbwheels, String model, int enginepower, String style) {
        super(type, nbwheels, model);
        this.enginepower = enginepower;
        this.style = style;
    }


    public Moto(String type, int nbwheels, String model) {
        super(type, nbwheels, model);
    }

    //endregion


    //region GET SET

    public int getEnginepower() {
        return enginepower;
    }

    public void setEnginepower(int enginepower) {
        this.enginepower = enginepower;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    //endregion









}
