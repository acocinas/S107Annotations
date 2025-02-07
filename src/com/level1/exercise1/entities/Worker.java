package com.level1.exercise1.entities;

public class Worker {
    private String name, surname;
    private double priceHour;

    public Worker(String name, String surname, double priceHour) {
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double calculateSalary(double hours) {
        return priceHour * hours;
    }
}

