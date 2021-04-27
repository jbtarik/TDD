package org.boufnichel.kata.tva;
import org.boufnichel.kata.Article;

import java.util.List;

public class Tva {
    private double taux;

    public Tva(double taux){
        this.taux=taux;

    }

    public double getTva(List<Article>articles){
        if (taux==0) return 0;
        double prixHT=articles.stream().mapToDouble(article->article.getPrixTotalHT()).sum();
        return prixHT*taux/100;
    }

    public double getTva(double montant){
        if (taux==0) return 0;
        return montant*taux/100;
    }
}
