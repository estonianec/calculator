package com.estonec.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String showHelloCalc() {
    return calculatorService.showHelloCalc();
    }
    @GetMapping("/plus")
    public String showResultOfPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorService.showResultOfPlus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }
    @GetMapping("/minus")
    public String showResultOfMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorService.showResultOfMinus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }
    @GetMapping("/multiply")
    public String showResultOfMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorService.showResultOfMultiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }
    @GetMapping("/divide")
    public String showResultOfDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя.";
        } else {
            float result = calculatorService.showResultOfDivide(num1, num2);
            return num1 + " / " + num2 + " = " + result;
        }
    }
}
