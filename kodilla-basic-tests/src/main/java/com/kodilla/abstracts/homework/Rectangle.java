package com.kodilla.abstracts.homework;
// Utwórz trzy klasy dziedziczące po klasie Shape wraz z wymaganą implementacją
// prostokąt
public class Rectangle extends Shape {
    private int sideA;
    private int sideB;
    public int getSideB() {
        return sideB;
    }
    public int getSideA() {
        return sideA;
    }
    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
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
