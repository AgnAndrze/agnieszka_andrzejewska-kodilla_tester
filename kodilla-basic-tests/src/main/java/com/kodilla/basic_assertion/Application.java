package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 5.6;
        double b = 5.8;
        int c = 2;
        double sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(11.4,sumResult,0.1);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb  " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        double substractResult = calculator.substract(a, b);
        correct = ResultChecker.assertEquals(-0.2, substractResult, 0.1);
        if (correct) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        double powerResult = calculator.pow(a,c);
        correct = ResultChecker.assertEquals(31.36, powerResult, 0.01);
        if (correct) {
            System.out.println("Metoda power działa poprawnie dla liczb " + a + " i " + c);
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczb " + a + " i " + c);
        }
    }
}
