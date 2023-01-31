package com.kodilla.abstracts.homework2;

public class ComplaintsAndReturnsSpecialist extends Job {
    public ComplaintsAndReturnsSpecialist(int salary) {
        super(salary);
    }
    @Override
    public void giveResponsibilities() {
        System.out.println("Opracowanie reklamacji i zwrotów.");
    }
    @Override
    public void giveSalary() {
        System.out.println("Wynagrodzenie to: " + getSalary());
    }
    @Override
    public void giveJob() {
        System.out.println("Specjalista ds. reklamacji i zwrotów");
    }
}
