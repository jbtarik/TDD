package org.tarik.kata;

public class Chebakiya extends ArticlePesable{


    public Chebakiya(double articlePrice, int articlePoids) {
        super(articlePrice, articlePoids);
    }

    @Override
    public String name() {
        return "Chebakiya";
    }
}
