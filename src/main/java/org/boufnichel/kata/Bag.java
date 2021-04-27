package org.boufnichel.kata;

import org.boufnichel.kata.tva.Tva;
import org.boufnichel.kata.tva.TvaFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bag {
    List<Article> articles=new ArrayList<>();
    Tva tva;
    public Bag(String s) {
        tva=TvaFactory.createTva(s);
        List<String> myList = new ArrayList<String>(Arrays.asList(s.split("#")));

        for(String article:myList){
            if(!article.contains("TVA:")){
                Article art=ArticleFactory.createArticle(article);
                articles.add(art);
            }

        }

    }

    public double calculate() {
        return      articles.stream().mapToDouble(article->article.getPrixTotalHT()+tva.getTva(article.getPrixTotalHT())).sum()
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
