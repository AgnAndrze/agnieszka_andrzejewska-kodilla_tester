package com.kodilla.abstracts.homework2;
//imię, praca, wiek
public class Person {
    private String firstName;
    private int age;
    private Job job;
    //konstruktor
    public Person (String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    //gettery
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public Job giveJob() {
        return job;
    }
    public void process() {
        System.out.println(getFirstName() + " "+ getAge() + " ");
        job.giveJob();
        job.giveSalary();
        job.giveResponsibilities();
    }
}
