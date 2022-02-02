package com.estonec.calculator.controller;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.estonec.calculator.constants.CalculatorServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParameterizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    int result;
    float float_result;

    public static Stream<Arguments> provideParamsForPlusTest() {
        return Stream.of(
                Arguments.of(POSITIVE_NUMBER, NEGATIVE_NUMBER, POSITIVE_NUMBER + NEGATIVE_NUMBER),
                Arguments.of(POSITIVE_NUMBER, ZERO_NUMBER, POSITIVE_NUMBER + ZERO_NUMBER),
                Arguments.of(POSITIVE_NUMBER, POSITIVE_NUMBER, POSITIVE_NUMBER + POSITIVE_NUMBER)
        );
    }
    public static Stream<Arguments> provideParamsForMinusTest() {
        return Stream.of(
                Arguments.of(POSITIVE_NUMBER, NEGATIVE_NUMBER, POSITIVE_NUMBER - NEGATIVE_NUMBER),
                Arguments.of(POSITIVE_NUMBER, ZERO_NUMBER, POSITIVE_NUMBER - ZERO_NUMBER),
                Arguments.of(POSITIVE_NUMBER, POSITIVE_NUMBER, POSITIVE_NUMBER - POSITIVE_NUMBER)
        );
    }
    public static Stream<Arguments> provideParamsForMultiplyTest() {
        return Stream.of(
                Arguments.of(POSITIVE_NUMBER, NEGATIVE_NUMBER, POSITIVE_NUMBER * NEGATIVE_NUMBER),
                Arguments.of(POSITIVE_NUMBER, ZERO_NUMBER, POSITIVE_NUMBER * ZERO_NUMBER),
                Arguments.of(POSITIVE_NUMBER, POSITIVE_NUMBER, POSITIVE_NUMBER * POSITIVE_NUMBER)
        );
    }
    public static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of(POSITIVE_NUMBER, NEGATIVE_NUMBER, POSITIVE_NUMBER / NEGATIVE_NUMBER),
                Arguments.of(ZERO_NUMBER, POSITIVE_NUMBER, ZERO_NUMBER / POSITIVE_NUMBER),
                Arguments.of(POSITIVE_NUMBER, POSITIVE_NUMBER, POSITIVE_NUMBER / POSITIVE_NUMBER)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTest")
    void showResultOfPlusTest(int num1, int num2, int expected) {
        result = out.showResultOfPlus(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTest")
    void showResultOfMinusTest(int num1, int num2, int expected) {
        result = out.showResultOfMinus(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    void showResultOfMultiplyTest(int num1, int num2, int expected) {
        result = out.showResultOfMultiply(num1, num2);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    void showResultOfDivideTest(int num1, int num2, int expected) {
        float_result = out.showResultOfDivide(num1, num2);
        assertEquals(expected, float_result);
    }
}