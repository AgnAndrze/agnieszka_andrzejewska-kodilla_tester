package com.kodilla.abstracts.homework2;

import com.kodilla.abstracts.homework2.Job;

public class EcommerceSpecialist extends Job {
    public EcommerceSpecialist(int salary) {
        super(salary);
    }
    @Override
    public void giveResponsibilities() {
        System.out.println("Obsługa sklepu internetowego.");
    }
    @Override
    public void giveSalary() {
        System.out.println("Wynagrodzenie to: " + getSalary());
    }
}