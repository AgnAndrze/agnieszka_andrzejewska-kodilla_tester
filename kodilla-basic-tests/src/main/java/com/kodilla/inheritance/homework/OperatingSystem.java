package com.kodilla.inheritance.homework;

public class OperatingSystem {
private static int year;
    public OperatingSystem(int year) {
        this.year = year;
    }
    public static int getYear() {
        return year;
    }
    public void turnOn() {
        System.out.println("Turn on.");
    }
    public void turnOff() {
        System.out.println("Turn off.");
    }
}
