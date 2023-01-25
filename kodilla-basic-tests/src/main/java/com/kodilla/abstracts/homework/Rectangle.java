package com.kodilla.abstracts.homework;
// Utwórz trzy klasy dziedziczące po klasie Shape wraz z wymaganą implementacją
// prostokąt
public class Rectangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;
    public Rectangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
    }
//pole powierzchni
    @Override
    public int getArea() {
        int result = 0;
        result = getSideA() * getSideB();
        return result;
    }
//obwód
    @Override
    public int getCircuit() {
        int result = 0;
        result = 2 * (getSideA() + getSideB());
        return result;
    }
}
