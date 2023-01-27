package com.kodilla.abstracts.homework2;

public class JobApplication {
    public static void main(String[] args) {
        Job automatictester = new AutomaticTester(4500);
        Person processor = new Person("Jessica",32);
        processor.process(automatictester);
        automatictester.giveJob();
        automatictester.giveResponsibilities();
        automatictester.giveSalary();

        Job complaintsandreturnsspecialist = new ComplaintsAndReturnsSpecialist(3200);
        processor = new Person("Thomas", 29);
        processor.process(complaintsandreturnsspecialist);
        complaintsandreturnsspecialist.giveJob();
        complaintsandreturnsspecialist.giveResponsibilities();
        complaintsandreturnsspecialist.giveSalary();

        Job ecommercespecialist = new EcommerceSpecialist(2900);
        processor = new Person("John", 25);
        processor.process(ecommercespecialist);
        ecommercespecialist.giveJob();
        ecommercespecialist.giveResponsibilities();
        ecommercespecialist.giveSalary();
    }
}
