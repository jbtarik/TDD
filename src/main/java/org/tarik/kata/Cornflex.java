package org.tarik.kata;

public class Cornflex extends ArticleUnitaire{
    public Cornflex(double articlePrice, int articleQtte) {
        super(articlePrice, articleQtte);
    }

    @Override
    public String name() {
        return "Cornflex";
    }
}
