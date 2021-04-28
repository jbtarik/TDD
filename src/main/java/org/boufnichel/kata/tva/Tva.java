package org.boufnichel.kata.tva;

public class Tva {
    private double taux;

    public Tva(double taux){
        this.taux=taux;

    }


    public double getTva(double montant){
        if (taux==0) return 0;
        return montant*taux/100;
    }
}
