package com.kodilla.abstracts.homework;
// Utwórz trzy klasy dziedziczące po klasie Shape wraz z wymaganą implementacją
// trójkąt prostokątny
public class RightTriangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;

    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public int getSideC() {
        return sideC;
    }
    public RightTriangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public int getArea() {
        int result = 0;
        result = (getSideA()*getSideB())/getSideC();
        return result;
    }
    @Override
    public int getCircuit() {
        int result = 0;
        result = getSideA() + getSideB() + getSideC();
        return result;
    }
}
