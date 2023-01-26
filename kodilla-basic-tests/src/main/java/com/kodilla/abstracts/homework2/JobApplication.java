package com.kodilla.abstracts.homework2;

public class JobApplication {
    public static void main(String[] args) {
        Job automatictester = new AutomaticTester(4500);
        Person processor = new Person("Jessica",32,"tester automatyzujący");
        processor.process(automatictester);
        automatictester.giveResponsibilities();
        automatictester.giveSalary();

        Job complaintsandreturnsspecialist = new ComplaintsAndReturnsSpecialist(3200);
        processor = new Person("Thomas", 29, "specjalista ds. reklamacji i zwrotów");
        processor.process(complaintsandreturnsspecialist);
        complaintsandreturnsspecialist.giveResponsibilities();
        complaintsandreturnsspecialist.giveSalary();

        Job ecommercespecialist = new EcommerceSpecialist(2900);
        processor = new Person("John", 25, "specjalista ds. e-commerce");
        processor.process(ecommercespecialist);
        ecommercespecialist.giveResponsibilities();
        ecommercespecialist.giveSalary();
    }
}
