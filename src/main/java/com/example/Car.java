package com.example;

/**
 * Created by Brandon on 9/29/2017.
 */

public class Car {

    public String Color = "Black";
    private  int mNoOfSeats = 5;
    private String mInterior;

    public Car() {
        mInterior = "Wood";
    }

    public Car(String chosenColor, String chosenInterior) {
        Color = chosenColor;
        mInterior = chosenInterior;
    }

    public int getmNoOfSeats() {
        //add code here

        return mNoOfSeats;
    }

    public String getmInterior() {
        return mInterior;
    }

    public void drive() {
        System.out.println("The car is moving");
    }


}
