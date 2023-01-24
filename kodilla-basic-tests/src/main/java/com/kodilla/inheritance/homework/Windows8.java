package com.kodilla.inheritance.homework;

public class Windows8 extends OperatingSystem {
    private int year;
    public Windows8(int year) {
        super(year);
    }
    public void getYearOfPublicationWin8() {
        System.out.println("Year of publication: " + getYear());
    }
    @Override
    public void turnOn() {
        System.out.println("Turn onx8.");
    }
    public void turnOff() {
        System.out.println("Turn offx8.");
    }
}
