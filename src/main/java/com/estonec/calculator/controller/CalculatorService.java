package com.estonec.calculator.controller;

public interface CalculatorService {
    String showHelloCalc();
    String showResultOfPlus(int num1, int num2);
    String showResultOfMinus(int num1, int num2);
    String showResultOfMultiply(int num1, int num2);
    String showResultOfDivide(int num1, int num2);
}
