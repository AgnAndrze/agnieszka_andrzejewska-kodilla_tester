package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        Windows10 win10 = new Windows10(2015);
        win10.turnOn();
        win10.getYearOfPublicationWin10();
        Windows8 win8 = new Windows8(2012);
        win8.turnOff();
        win8.getYearOfPublicationWin8();
    }
}
