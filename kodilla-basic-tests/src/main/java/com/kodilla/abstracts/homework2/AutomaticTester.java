package com.kodilla.abstracts.homework2;
import com.kodilla.abstracts.homework2.Job;
public class AutomaticTester extends Job {
    public AutomaticTester(int salary) {
        super(salary);
    }
    @Override
    public void giveResponsibilities() {
        System.out.println("Testowanie oprogramowania.");
    }
    @Override
    public void giveSalary() {
        System.out.println("Wynagrodzenie to: " + getSalary());
    }
    @Override
    public void giveJob() {
        System.out.println("Stanowisko to: tester automatyczny");
    }
}
