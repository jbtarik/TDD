package org.boufnichel.kata.util;

public class FactoryUtil {
    final static String SEPARATEUR=":";

    public static String getArticleName(String articleDesc){
        return articleDescToArray(articleDesc)[0];
    }
    public static int getArticleQtte(String articleDesc){
        return Integer.valueOf(articleDescToArray(articleDesc)[1]);
    }
    public static int getArticlePoids(String articleDesc){
        return Integer.valueOf(articleDescToArray(articleDesc)[1].replace("g",""));
    }
    public static double  getArticlePrice(String articleDesc){
        return Double.valueOf(articleDescToArray(articleDesc)[2]);
    }



    public static int getTypeArticle(String articleDesc){
        String[] arr=articleDescToArray(articleDesc);
        if(arr[1].contains("g")) return 1;//article pesable
        return 2;//article par unité
    }
    public static String[] articleDescToArray(String articleDesc){
        String[] arr=articleDesc.split(SEPARATEUR);
        arr[1]=arr[1].equals("")?"1":arr[1];
        return arr;
    }

}
