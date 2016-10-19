package com.example.iem.volkswagengroup;

import java.util.Date;

/**
 * Created by iem on 19/10/2016.
 */

class Filiales {


    //region VARIABLES

    protected String nom;
    protected float CA;
    protected Date DateRachat;
    protected int NbEmploye;

    //endregion

    //region CONSTRUCTOR

    public Filiales(String nom, float CA, Date dateRachat, int nbEmploye) {
        this.nom = nom;
        this.CA = CA;
        DateRachat = dateRachat;
        NbEmploye = nbEmploye;
    }

    //endregion

    //region GET SET

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getCA() {
        return CA;
    }

    public void setCA(float CA) {
        this.CA = CA;
    }

    public Date getDateRachat() {
        return DateRachat;
    }

    public void setDateRachat(Date dateRachat) {
        DateRachat = dateRachat;
    }

    public int getNbEmploye() {
        return NbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
        NbEmploye = nbEmploye;
    }

    //endregion
}
