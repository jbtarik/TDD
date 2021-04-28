package org.boufnichel.kata.creators;

import org.boufnichel.kata.tva.Tva;

public class TvaFactory {
    static final String SEPARATEUR="#";
    public static Tva createTva(String allInfo){
        return new Tva(extractTaux(allInfo));
    }

    static double extractTaux(String allInfo){
        if (tvaApplicable(allInfo)){
            String[] arr=allInfo.split(SEPARATEUR);
            String lasFragment=arr[arr.length-1];
            return Double.parseDouble(lasFragment.split(":")[1]);
        }else return 0;

    }
    static boolean tvaApplicable(String allInfo){
        return allInfo.contains("TVA:");
    }

}
