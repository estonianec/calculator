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
        return calculatorService.showResultOfPlus(num1, num2);
    }
    @GetMapping("/minus")
    public String showResultOfMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.showResultOfMinus(num1, num2);
    }
    @GetMapping("/multiply")
    public String showResultOfMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.showResultOfMultiply(num1, num2);
    }
    @GetMapping("/divide")
    public String showResultOfDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.showResultOfDivide(num1, num2);
    }
}
