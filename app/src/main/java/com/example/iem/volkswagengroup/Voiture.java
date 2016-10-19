package com.example.iem.volkswagengroup;

/**
 * Created by iem on 19/10/2016.
 */

class Voiture extends Vehicule {


    //region VARIABlES


    protected int nbportes;
    protected int power;


    //endregion

    //region CONSTRUCTOR


    public Voiture(String type, int nbwheels, String model, int power, int nbportes) {
        super(type, nbwheels, model);
        this.power = power;
        this.nbportes = nbportes;
    }

    public Voiture(String type, int nbwheels, String model) {
        super(type, nbwheels, model);
    }

    //endregion

    //region GET SET

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNbportes() {
        return nbportes;
    }

    public void setNbportes(int nbportes) {
        this.nbportes = nbportes;
    }


    //endregion










}
