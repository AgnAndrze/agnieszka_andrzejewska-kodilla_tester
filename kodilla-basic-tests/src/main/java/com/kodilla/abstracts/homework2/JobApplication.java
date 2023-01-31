package com.kodilla.abstracts.homework2;

public class JobApplication {
    public static void main(String[] args) {
        Job automatictester = new AutomaticTester(4500);
        Person processor = new Person("Jessica",32, automatictester);
        processor.process();

        Job complaintsandreturnsspecialist = new ComplaintsAndReturnsSpecialist(3200);
        processor = new Person("Thomas", 29, complaintsandreturnsspecialist);
        processor.process();

        Job ecommercespecialist = new EcommerceSpecialist(2900);
        processor = new Person("John", 25, ecommercespecialist);
        processor.process();
    }
}
