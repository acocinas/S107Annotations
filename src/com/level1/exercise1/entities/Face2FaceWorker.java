package com.level1.exercise1.entities;

public class Face2FaceWorker extends Worker{
    private static double gas = 200;

    public Face2FaceWorker(String name, String surname, double priceHour){
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(double hours){
        return super.calculateSalary(hours) + gas;
    }

    @Deprecated  //exercise2
    public double calculateSalaryNoGas(double hours){
        return super.calculateSalary(hours);
    }
}
