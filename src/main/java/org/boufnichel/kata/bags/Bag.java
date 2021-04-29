package org.boufnichel.kata.bags;

import org.boufnichel.kata.creators.ArticleFactory;
import org.boufnichel.kata.creators.BagBuilder;
import org.boufnichel.kata.creators.TvaFactory;
import org.boufnichel.kata.tva.Tva;

import java.util.List;

public class Bag {
    List<Article> articles;
    Tva tva;
    public Bag(String s) {
        tva=TvaFactory.createTva(s);
        articles= BagBuilder.getBag(s);
    }

    public double calculate() {
        return articles.stream().mapToDouble(article->article.getPrixTotalHT()+tva.getTva(article.getPrixTotalHT())).sum();
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
