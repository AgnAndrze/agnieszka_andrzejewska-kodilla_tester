package com.kodilla.abstracts.homework;
// Utwórz abstrakcyjną klasę Shape
// z dwiema abstrakcyjnymi metodami
// obliczającym pole powierzchni i obwód
public abstract class Shape {
private int sideA;
private int sideB;
private int sideC;
// konstruktor
public Shape(int sideA, int sideB, int sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
}
//gettery
public int getSideA() {
    return sideA;
}
public int getSideB() {
    return sideB;
}
public int getSideC(){
    return sideC;
}
//wyrzuć działanie - pole powierzchni
public abstract int getArea();
//wyrzuć działanie - obwód
public abstract int getCircuit();
}