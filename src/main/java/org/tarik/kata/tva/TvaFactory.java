package org.tarik.kata.tva;

public class TvaFactory {
    static final String separateur="#";
    public static Tva createTva(String allInfo){
        return new Tva(extractTaux(allInfo));
    }

    static double extractTaux(String allInfo){
        if (tvaApplicable(allInfo)){
            String[] arr=allInfo.split(separateur);
            return Double.valueOf(arr[arr.length-1].split(":")[1]);
        }else return 0;

    }
    static boolean tvaApplicable(String allInfo){
        return allInfo.contains("#TVA");
    }

}
