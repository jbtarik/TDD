package org.boufnichel.kata;

public abstract class Article {
    private final String name;
    protected final double price;
    protected int qtte;
    public Article(String name,double price,int qtte) {
        this.name = name;
        this.price=price;
        this.qtte=qtte;
    }
    public abstract double getPrixTotalHT();
}
