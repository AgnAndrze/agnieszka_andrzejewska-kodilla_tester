package com.kodilla.abstracts.homework2;
//imię, praca, wiek
public class Person {
    private String firstName;
    private String job;
    private int age;
    //konstruktor
    public Person (String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    //gettery
    public String getFirstName() {
        return firstName;
    }
    public String getJob() {
        return job;
    }
    public int getAge() {
        return age;
    }
    public void process(Job job) {
        System.out.println(getFirstName() + " "+ getAge() + " " + getJob() + " " );
    }
}
