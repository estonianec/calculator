package com.estonec.calculator.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.estonec.calculator.constants.CalculatorServiceTestConstants.*;

import static com.estonec.calculator.constants.CalculatorServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    int result;
    float float_result;

    @Test
    void showResultOfPlusPositiveNumberVsNegativeNumber() {
        result = out.showResultOfPlus(POSITIVE_NUMBER, NEGATIVE_NUMBER);
        Assertions.assertEquals(POSITIVE_NUMBER + NEGATIVE_NUMBER, result);
    }

    @Test
    void showResultOfPlusPositiveNumberVsZeroNumber() {
        result = out.showResultOfPlus(POSITIVE_NUMBER, ZERO_NUMBER);
        Assertions.assertEquals(POSITIVE_NUMBER + ZERO_NUMBER, result);
    }

    @Test
    void showResultOfMinusNegativeNumberVsNegativeNumber() {
        result = out.showResultOfMinus(NEGATIVE_NUMBER, NEGATIVE_NUMBER);
        Assertions.assertEquals(NEGATIVE_NUMBER - NEGATIVE_NUMBER,result);
    }

    @Test
    void showResultOfMinusNegativeNumberVsPositiveNumber() {
        result = out.showResultOfMinus(NEGATIVE_NUMBER, POSITIVE_NUMBER);
        Assertions.assertEquals(NEGATIVE_NUMBER - POSITIVE_NUMBER,result);
    }

    @Test
    void showResultOfMultiplyPositiveNumberVsZeroNumber() {
        result = out.showResultOfMultiply(POSITIVE_NUMBER, ZERO_NUMBER);
        Assertions.assertEquals(POSITIVE_NUMBER * ZERO_NUMBER, result);
    }

    @Test
    void showResultOfMultiplyPositiveNumberVsNegativeNumber() {
        result = out.showResultOfMultiply(POSITIVE_NUMBER, NEGATIVE_NUMBER);
        Assertions.assertEquals(POSITIVE_NUMBER * NEGATIVE_NUMBER, result);
    }

    @Test
    void showResultOfDivideNegativeNumberVsPositiveNumber() {
        float_result = out.showResultOfDivide(NEGATIVE_NUMBER, POSITIVE_NUMBER);
        Assertions.assertEquals(NEGATIVE_NUMBER / POSITIVE_NUMBER, float_result);
    }

    @Test
    void showResultOfDivideThrowIllegalArgumentExceptionWhenNum2IsZeroNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.showResultOfDivide(POSITIVE_NUMBER, ZERO_NUMBER));
    }
}