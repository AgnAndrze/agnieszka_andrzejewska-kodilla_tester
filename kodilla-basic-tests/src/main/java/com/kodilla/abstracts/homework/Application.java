package com.kodilla.abstracts.homework;
// Działanie zaprezentuj w klasie Application.
public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12,20);
        System.out.println("Pole prostokąta to: " + rectangle.getArea());
        System.out.println("Obwód prostokąta to: " + rectangle.getCircuit());
        RightTriangle rightTriangle = new RightTriangle(15,20,11);
        System.out.println("Pole trójkąta prostokątnego to: " + rightTriangle.getArea());
        System.out.println("Obwód trojkąta prostokątnego to: " + rightTriangle.getCircuit());
        Square square = new Square(17);
        System.out.println("Pole kwadratu to: " + square.getArea());
        System.out.println("Obwód kwadratu to: " + square.getCircuit());
    }
}
