package com.example;

public class CarSimulator {

    public static void main(String[] args) {
        System.out.println("Launching car sim...");

        Car myToyota = new Car("Blue", "Leather");

        System.out.println("The color is " + myToyota.Color);

        System.out.println("The interior is " + myToyota.getmInterior());

        System.out.println("The number of seats are " + myToyota.getmNoOfSeats());

        Car myHonda = new Car();
        System.out.println(myHonda.Color + " is the color " + myHonda.getmInterior() + " is my interior of my Honda");

        myHonda.drive();
    }
}
