package com.kerosi.util;

import com.kerosi.models.UserInput;

import java.security.Key;

public class Validator {

    public boolean isValid(UserInput userInput){
        boolean oisValid = operationValidator(userInput.getOperation());
        boolean misValid = messageValidator(userInput.getMessage());
        boolean kisValid = keyValidator(userInput.getKey());

        return oisValid && misValid && kisValid;


    }
    private boolean operationValidator(String operation){
        // two operations -> decode, encode
        boolean isValid = operation.equalsIgnoreCase ("encode")||
        operation.equalsIgnoreCase("decode" );
        return isValid;
    }
    private boolean messageValidator(String message){
        boolean isBlankOrEmpty = message.isBlank() && message.isEmpty();
        return !isBlankOrEmpty;
    }
    private boolean keyValidator(int key){
        return (key >= 1) && (key <= 25);
    }

}


