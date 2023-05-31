package com.kerosi.services;

import com.kerosi.models.UserInput;
import com.kerosi.util.Validator;

import java.util.Scanner;

public class GetUserInput {
    public static UserInput input;
    public static boolean getUserInput(){
        Scanner scanner = new Scanner(System.in);
        String operation;
        String message;
        int key;
        UserInput userInput = new UserInput();
        Validator validator = new Validator();

        System.out.println("choose the operation(*encode* or *decode* )");
        operation = scanner.nextLine();
        System.out.println("message");

        System.out.print("Enter your message:");
        message = scanner.nextLine().toUpperCase();
        System.out.println("message");

        System.out.print("Enter your secret key: ");
        key = scanner.nextInt();
        System.out.println("1");

        userInput.setKey(key);
        userInput.setMessage(message);
        userInput.setOperation(operation);

        input = userInput;

        boolean userInPutIsValid = validator.isValid(userInput);
        scanner.close();

        return validator.isValid(userInput);

    }
}
