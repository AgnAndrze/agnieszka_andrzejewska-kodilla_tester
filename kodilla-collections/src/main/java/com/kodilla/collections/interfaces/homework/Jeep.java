package com.kodilla.collections.interfaces.homework;

public class Jeep implements Car{
    private int speed;
    public Jeep (int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        this.speed +=10;
    }
    @Override
    public void decreaseSpeed() {
        this.speed -=6;
    }
}
