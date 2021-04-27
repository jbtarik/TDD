package org.tarik.kata;

public abstract class ArticleUnitaire extends Article{
    int qtte;

    public ArticleUnitaire(double articlePrice, int articleQtte){
        price=articlePrice;
        qtte=articleQtte;
    }
    @Override
    public double priceHT() {
        return price*qtte;
    }
}
