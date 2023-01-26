package com.kodilla.abstracts.homework2;

public class ComplaintsAndReturnsSpecialist extends Job {
    public void Person() {
        Person thomas = new Person ("Thomas", 27, "complaints and returns specialist");
    }
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
}
