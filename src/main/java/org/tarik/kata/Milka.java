package org.tarik.kata;

public class Milka extends ArticleUnitaire{


    public Milka(double articlePrice, int articleQtte) {
        super(articlePrice, articleQtte);
    }

    @Override
    public String name() {
        return "Milka";
    }
}
