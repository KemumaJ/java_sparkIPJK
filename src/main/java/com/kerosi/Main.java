package com.kerosi;

import com.kerosi.models.UserInput;
import com.kerosi.services.CaesarCipher;
import com.kerosi.services.GetUserInput;
import com.kerosi.util.Validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean userInputIsValid = GetUserInput.getUserInput();

        if(userInputIsValid){
            UserInput userInput = GetUserInput.input;
            CaesarCipher caesarCipher = new CaesarCipher();

             if(userInput.getOperation(). equalsIgnoreCase ( "encode")){
                 String cipherText = caesarCipher.encode(userInput.getMessage(), userInput.getKey());
                System.out.println("Your Cipher Test is:" + cipherText);
            } else if(userInput.getOperation().equalsIgnoreCase (  "decode")){
                String plainText = caesarCipher.decode(userInput.getMessage(), userInput.getKey());
                System.out.println("Your Plain Test is:" + plainText);
            }

        } else{
            System.out.println("do not proceed");
        }

    }
}