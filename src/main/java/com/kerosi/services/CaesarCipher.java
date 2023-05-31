package com.kerosi.services;

import java.lang.management.OperatingSystemMXBean;

public class CaesarCipher {
    private static final String ALPHABETS ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encode (String message, int key){
        String output = "";
        for(char c:message.toUpperCase().toCharArray()){
            output = output + shiftChar(c, key);
        }
        return output;

    }

    public static String decode(String message, int key) {
        return "";
    }
    private static char shiftChar( char c , int k){
        int oldIndex = ALPHABETS.indexOf(c);
        if (oldIndex == -1) {
            return c;
        }
        int newIndex = (oldIndex + k) % 26;

        int pos;
        char cipherChar;
        if (newIndex > 25)
        {
            pos = newIndex - 26;
            cipherChar = ALPHABETS.charAt(pos);
        } else if (newIndex < 0) {
            pos = newIndex + 26;
            cipherChar = ALPHABETS.charAt(pos);


        } else {
            pos = newIndex;
            cipherChar = ALPHABETS.charAt(pos);
        }

        return cipherChar;
    }
}






