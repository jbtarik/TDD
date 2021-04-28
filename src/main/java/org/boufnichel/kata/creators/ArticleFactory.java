package org.boufnichel.kata.creators;

import org.boufnichel.kata.Article;
import org.boufnichel.kata.ArticlePesable;
import org.boufnichel.kata.ArticleUnitaire;
import org.boufnichel.kata.util.FactoryUtil;

public class ArticleFactory {
    public static Article createArticle(String allInfo){
        switch (FactoryUtil.getTypeArticle(allInfo)){
            //TODO - use lombok builder
            case 1:return  ArticlePesable.builder()
                    .name(FactoryUtil.getArticleName(allInfo))
                    .price(FactoryUtil.getArticlePrice(allInfo))
                    .qtte(FactoryUtil.getArticlePoids(allInfo)).build();
            case 2:return  ArticleUnitaire.builder()
                    .name(FactoryUtil.getArticleName(allInfo))
                    .price(FactoryUtil.getArticlePrice(allInfo))
                    .qtte(FactoryUtil.getArticleQtte(allInfo)).build();
            default:return null;
        }
    }

    //TODO - move to util class
    //TODO - call split method once

}
