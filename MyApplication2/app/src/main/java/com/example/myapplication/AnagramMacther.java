package com.example.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class AnagramMacther {


    /**
     * This methods checks if the provided string represents a valid email
     * address and return true if it is.
     *
     * @param email
     * @return
     */

    public boolean isValidEmailAddress(String email){
        boolean hasAtSign = email.indexOf("@") > -1;
        return hasAtSign;
    }
    public boolean AnagramChecker(String n1 , String n2)
    {
        char char_n1[] = n1.toCharArray();
        char char_n2[] = n2.toCharArray();
       int[] counterOfn1 = new int[256];
       int[] counterOfn2 = new int[256];

       for(int i = 0 ; i < n1.length() ; i++) counterOfn1[i] = 0 ;
       for(int i = 0; i < n2.length(); i++) counterOfn2[i] = 0;

       for(int i= 0 ; i < n1.length() ; i++ ) {
           counterOfn1[char_n1[i]]++;
       }

        for(int i= 0 ; i < n1.length() ; i++ ) {
             counterOfn2[char_n2[i]]++;
        }

        if(n1.length() == n2.length())
        {
             return false;
        }
        for (int i = 0 ;i < 256 ; i++ )
        {
            if(counterOfn1[i] != counterOfn2[i])
                return false;
        }
        return true;


    }
}
