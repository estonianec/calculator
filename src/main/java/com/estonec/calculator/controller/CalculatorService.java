package com.estonec.calculator.controller;

public interface CalculatorService {
    String showHelloCalc();
    int showResultOfPlus(int num1, int num2);
    int showResultOfMinus(int num1, int num2);
    int showResultOfMultiply(int num1, int num2);
    float showResultOfDivide(int num1, int num2);
}
