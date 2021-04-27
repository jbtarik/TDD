package org.boufnichel.kata;

public class ArticleUnitaire extends Article{

    public ArticleUnitaire(String name, double price, int qtte) {
        super(name, price, qtte);
    }

    @Override
    public double getPrixTotalHT() {
        return price*qtte;
    }
}
