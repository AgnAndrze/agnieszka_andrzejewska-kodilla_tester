package com.kodilla.abstracts.homework;
// Utwórz trzy klasy dziedziczące po klasie Shape wraz z wymaganą implementacją
// trójkąt prostokątny
public class RightTriangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;
    public RightTriangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
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
