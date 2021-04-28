package org.boufnichel.kata.creators;

import org.boufnichel.kata.Article;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BagBuilder {
    public static List<Article> getBag(String bagComposant){
        List<Article>articles=new ArrayList<>();
        List<String> articlesDesc = parseBagComponent(bagComposant);
        for(String articleDes:articlesDesc){
            if(!isTva(articleDes)){
                Article art= ArticleFactory.createArticle(articleDes);
                articles.add(art);
            }

        }
        return articles;
    }

    private static List<String> parseBagComponent(String bagComposant){
        return Arrays.asList(bagComposant.split("#"));
    }
    private static boolean isTva(String description){
        return description.contains("TVA:");
    }

}
