package com.level1.exercise1.entities;

public class OnlineWorker extends Worker{
    private static final double internetRate = 50;

    public OnlineWorker(String name, String surname, double priceHour){
        super(name, surname, priceHour);
    }

    public double calculateSalary(int hours){
        return super.calculateSalary(hours) + internetRate;
    }
}
