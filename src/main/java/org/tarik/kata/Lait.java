package org.tarik.kata;

public class Lait extends ArticleUnitaire{


    public Lait(double articlePrice, int articleQtte) {
        super(articlePrice, articleQtte);
    }

    @Override
    public String name() {
        return "Lait";
    }
}
