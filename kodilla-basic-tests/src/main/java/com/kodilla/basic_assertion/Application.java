package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 6;
        int b = 2;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(8,sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb  " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int substractResult = calculator.substract(a, b);
        correct = ResultChecker.assertEquals(4, substractResult);
        if (correct) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int powerResult = calculator.pow(a, b);
        correct = ResultChecker.assertEquals(36, powerResult);
        if (correct) {
            System.out.println("Metoda power działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
