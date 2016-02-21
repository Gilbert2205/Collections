package com.company;

import java.util.Comparator;

/**
 * Created by IT_School on 2/21/2016.
 */
public class MyComp implements Comparator<String> {
    public int compare (String a, String b){
        String aStr, bStr;
        aStr = a;
        bStr = b;

        return bStr.compareTo(aStr);
    }
}

