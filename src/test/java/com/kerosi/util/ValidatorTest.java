package com.kerosi.util;

import com.kerosi.models.UserInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @Test
    void testInvalidMessage_validatorReturnFalse() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("");
        userInput.setKey(1);
        assertFalse(validator.isValid(userInput));
    }
    @Test
    void testInvalidKey_validatorReturnFalse() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("message");
        userInput.setKey(26);
        assertFalse(validator.isValid(userInput));
    }
    @Test
    void testInvalidOperation_validatorReturnFalse() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("jekhsadaie");
        userInput.setMessage("message");
        userInput.setKey(1);
        assertFalse(validator.isValid(userInput));
    }
    @Test
    void testValidOnValidUserInput_validatorReturnTrue() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("message");
        userInput.setKey(1);
        assertTrue(validator.isValid(userInput));
    }
}
