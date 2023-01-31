package com.kodilla.abstracts.homework2;
//salary = wypłata
//responsibilities = obowiązki
public abstract class Job {
    private int salary;
    private String responsibilities;
    public Job(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public String getResponsibilities() {
        return responsibilities;
    }
    public abstract void giveResponsibilities();
    public abstract void giveSalary();
    public abstract void giveJob();

}
