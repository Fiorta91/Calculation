package ru.yagunova.calcapp._main;

import ru.yagunova.calcapp.service.ResultWriterService;
import ru.yagunova.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        double num1 = 1.456d;
        double num2 = 3423.34d;
        double sum = Calculator.summarize(num1, num2);
        ResultWriterService.print(num1, num2, sum, "сложение");
        double sub = Calculator.substract(num2, num1);
        ResultWriterService.print(num2, num1, sub, "Вычитание");
        double multy = Calculator.multiply(num1, num2);
        ResultWriterService.print(num1, num2, multy, "умножение");
    }
}
