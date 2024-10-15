package ru.yagunova.calcapp._main;

import ru.yagunova.calcapp.service.ResultWriterService;
import ru.yagunova.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        double num1 = 1.456d;
        double num2 = 3423.34d;
        double result = Calculator.summarize(num1, num2);
        ResultWriterService.print(num1, num2, result, "Сложение");
        result = Calculator.substract(num2, num1);
        ResultWriterService.print(num2, num1, result, "Вычитание");
        result = Calculator.multiply(num1, num2);
        ResultWriterService.print(num1, num2, result, "Умножение");
    }
}
