package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {
    public Windows10(int year) {
        super(year);
    }
    public void getYearOfPublicationWin10() {
        System.out.println("Year of publication: " + getYear());
    }
    @Override
    public void turnOn() {
        System.out.println("Turn onx10.");
    }
    public void turnOff() {
        System.out.println("Turn offx10.");
    }
}