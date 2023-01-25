package com.kodilla.abstracts.homework;
// Utwórz trzy klasy dziedziczące po klasie Shape wraz z wymaganą implementacją
// kwadrat
public class Square extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;
    public Square (int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
    }
//pole powierzchni
    @Override
    public int getArea() {
       int result = 0;
       result = getSideA() * getSideA();
       return result;
    }
//obwód
    @Override
    public int getCircuit() {
        int result = 0;
        result = 4 * getSideA();
        return result;
    }
}
