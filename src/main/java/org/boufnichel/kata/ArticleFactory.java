package org.boufnichel.kata;

public class ArticleFactory {
    public static Article createArticle(String allInfo){
        switch (getTypeArticle(allInfo)){
            case 1:return new ArticlePesable(getArticleName(allInfo),getArticlePrice(allInfo),getArticleQtte(allInfo));
            case 2:return new ArticleUnitaire(getArticleName(allInfo),getArticlePrice(allInfo),getArticleQtte(allInfo));
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
        return Integer.valueOf(arr[1].replace("g",""));
    }
    private static double getArticlePrice(String allInfo){
        String[] arr=allInfo.split(":");
        if (arr.length>2) return Double.valueOf(arr[2]);
        return 0;
    }
    private static int getTypeArticle(String allInfo){
        String[] arr=allInfo.split(":");
        if(arr[1].contains("g")) return 1;//article pesable
        return 2;//article par unité
    }
}
