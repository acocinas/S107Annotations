package com.level1.exercise1.model;

import com.level1.exercise1.entities.*;

public class Principal {
    public static void runPrincipal() {

        double hours = 160;

        Face2FaceWorker face2FaceWorker = new Face2FaceWorker("Ángel", "Peláez", 18.5);

        OnlineWorker onlineWorker = new OnlineWorker("Marc", "Luque", 18.75);

        System.out.println("El sueldo de " + face2FaceWorker.getName() + " " + face2FaceWorker.getSurname() + " " + " es de " +
                face2FaceWorker.calculateSalary(hours) + " €.");
        System.out.println("El sueldo de " + onlineWorker.getName() + " " + onlineWorker.getSurname() + " " + " es de " +
                onlineWorker.calculateSalary(hours) + " €.");
    }
}