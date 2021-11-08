package com.calculator.calculatorfx;

public class Model {
    public float operation (float firstOperand, float secondOperand, String operator) {
        switch (operator) {
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "*":
                return firstOperand * secondOperand;
            case "/":
                if (secondOperand != 0) return firstOperand / secondOperand;
                return 0;
        }
        return 0;
    }
}
