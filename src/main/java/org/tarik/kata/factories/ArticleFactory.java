package org.tarik.kata.factories;

import org.tarik.kata.*;

public class ArticleFactory {
    public static Article createArticle(String allInfo){
        switch (getArticleName(allInfo)){
            case "Lait": return new Lait(getArticlePrice(allInfo),getArticleQtte(allInfo));
            case "Chebakiya": return new Chebakiya(getArticlePrice(allInfo),getArticlePoids(allInfo));
            case "Milka": return new Milka(getArticlePrice(allInfo),getArticleQtte(allInfo));
            case "Cornflex": return new Cornflex(getArticlePrice(allInfo),getArticleQtte(allInfo));
            default:return null;
        }

    }
    private static String getArticleName(String allInfo){
        String[] arr=allInfo.split(":");
        if (arr.length>0) return arr[0];
        return null;
    }
    private static int getArticleQtte(String allInfo){
        String[] arr=allInfo.split(":");
        if(arr[1].equals("")) return 1;
        return Integer.valueOf(arr[1]);
    }
    private static int getArticlePoids(String allInfo){
        String[] arr=allInfo.split(":");
        if(arr[1].equals("")) return 1;
        return Integer.valueOf(arr[1].replace("g",""));
    }
    private static double getArticlePrice(String allInfo){
        String[] arr=allInfo.split(":");
        if (arr.length>2) return Double.valueOf(arr[2]);
        return 0;
    }

}
