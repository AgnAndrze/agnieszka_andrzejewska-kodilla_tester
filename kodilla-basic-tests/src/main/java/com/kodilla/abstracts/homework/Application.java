package com.kodilla.abstracts.homework;
// Działanie zaprezentuj w klasie Application.
public class Application {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12,6,0);
        System.out.println("Pole prostokąta to: " + rectangle.getArea());
        System.out.println("Obwód prostokąta to: " + rectangle.getCircuit());
        Shape rightTriangle = new RightTriangle(5,8,4);
        System.out.println("Pole trójkąta prostokątnego to: " + rightTriangle.getArea());
        System.out.println("Obwód trojkąta prostokątnego to: " + rightTriangle.getCircuit());
        Shape square = new Square(7,0,0);
        System.out.println("Pole kwadratu to: " + square.getArea());
        System.out.println("Obwód kwadratu to: " + square.getCircuit());
    }
}
