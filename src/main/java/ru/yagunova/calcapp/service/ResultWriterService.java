package ru.yagunova.calcapp.service;

public class ResultWriterService {
    public static void print(double num1, double num2, double result, String action) {
        System.out.println("Number1: " + num1 + " Number2: " + num2 + " " + action + ": " + result);
    }
}
