package org.tarik.kata;


import org.tarik.kata.factories.ArticleFactory;
import org.tarik.kata.factories.BagBuilder;
import org.tarik.kata.tva.Tva;
import org.tarik.kata.tva.TvaFactory;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    List<Article> articles=new ArrayList<>();
    Tva tva;
    public Bag(String s) {
        tva=TvaFactory.createTva(s);
        articles= BagBuilder.getBag(s);

    }

    public double calculate() {
        return      articles.stream().mapToDouble(article->article.priceHT()+tva.getTva(article.priceHT())).sum()
                //+
                 //   tva.getTva(articles)
        ;
    }

    public void add(String s) {
        articles.add(ArticleFactory.createArticle(s));
    }

    public int count() {
        return articles.size();
    }

    public void clear() {
        articles.clear();
    }

}
