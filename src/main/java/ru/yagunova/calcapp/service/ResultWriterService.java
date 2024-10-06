package ru.yagunova.calcapp.service;

public class ResultWriterService {
    public static void print(double number1, double number2, double number3, String action){
        System.out.println("Number1: "+number1+" Number2: "+ number2 + " "+ action +": "+ number3);
    }
}
