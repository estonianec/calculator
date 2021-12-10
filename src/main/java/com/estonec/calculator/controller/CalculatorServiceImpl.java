package com.estonec.calculator.controller;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String showHelloCalc() {
        return "Добро пожаловать в калькулятор!<BR>Задача №2 по <a href=\"/calculator/plus?num1=5&num2=5\">ссылке</a>" +
                "<BR>Задача №3 по <a href=\"/calculator/minus?num1=5&num2=5\">ссылке</a>" +
                "<BR>Задача №4 по <a href=\"/calculator/multiply?num1=5&num2=5\">ссылке</a>" +
                "<BR>Задача №5 по <a href=\"/calculator/divide?num1=5&num2=5\">ссылке</a>";
    }

    public String showResultOfPlus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String showResultOfMinus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String showResultOfMultiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String showResultOfDivide(int num1, int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя.";
        } else {
            float result = (float) num1 / (float) num2;
            return num1 + " / " + num2 + " = " + result;
        }
    }
}
