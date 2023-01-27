package com.kodilla.abstracts.homework2;
//imię, praca, wiek
public class Person {
    private String firstName;
    private int age;
    //konstruktor
    public Person (String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }
    //gettery
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public void process(Job job) {
        System.out.println(getFirstName() + " "+ getAge() + " ");
    }
}
