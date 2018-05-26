package com.blyth.luke.higherorlower;

import android.app.Application;

import java.util.Random;

public class randomNumberGenerator extends Application {
    private int mrandomNumber;

    public int getRandomNumber() {
        return  mrandomNumber;
    }

    private int returnRandom() {
        Random rand = new Random();
        return rand.nextInt(20) + 1;
    }

    public void setRandomNumber() {
        mrandomNumber = returnRandom();
    }
}
