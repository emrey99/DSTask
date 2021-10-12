package com.test.task;

import java.util.Arrays;

public class DemoTask {

    public static void main(String[] args) {
        Arrays.stream(args).forEach(arg -> {
            System.out.println(arg + " - " + isValidExpression(arg));
        });
    }

    public static boolean isValidExpression(String expression) {
        String firstLetter = expression.substring(0, 1);
        String lastLetter = expression.substring(expression.length() - 1);
        return isValidExpression(firstLetter, lastLetter);
    }

    public static boolean isValidExpression(String firstLetter, String lastLetter) {
        return firstLetter.equals(firstLetter.toUpperCase()) && lastLetter.equals(lastLetter.toLowerCase());
    }

    //TODO: Other option of the validation with additional check.
    // Accepts "firstLetter, lastLetter" in order to reduce duplication which can be moved to main function
    public static boolean isValidExpressionMatchingLetters(String firstLetter, String lastLetter) {
        return isValidExpression(firstLetter, lastLetter) && firstLetter.equalsIgnoreCase(lastLetter);
    }
}