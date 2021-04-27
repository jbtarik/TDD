package org.tarik.kata;

public abstract class ArticlePesable extends Article {
    double poids;
    public ArticlePesable(double articlePrice, int articlePoids){
        price=articlePrice;
        poids=articlePoids;
    }
    @Override
    public double priceHT() {
        return price*poids/1000;
    }
}
