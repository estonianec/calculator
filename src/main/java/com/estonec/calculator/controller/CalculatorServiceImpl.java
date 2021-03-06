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

    public int showResultOfPlus(int num1, int num2) {
        return num1 + num2;
    }

    public int showResultOfMinus(int num1, int num2) {
        return num1 - num2;
    }

    public int showResultOfMultiply(int num1, int num2) {
        return num1 * num2;
    }

    public float showResultOfDivide(int num1, int num2) {
            return (float) num1 / (float) num2;
    }
}
