package ru.yagunova.calcapp._main;

import ru.yagunova.calcapp.service.ResultWriterService;
import ru.yagunova.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        double a = 1.456d;
        double b = 3423.34d;
        double c = Calculator.summarize(a, b);
        ResultWriterService.print(a, b, c, "сложение");
        double d = Calculator.substract(b, a);
        ResultWriterService.print(b, a, d, "Вычитание");
        double e = Calculator.multiply(a, b);
        ResultWriterService.print(a, b, e, "умножение");
    }
}
