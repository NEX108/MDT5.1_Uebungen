package com.example.firstproject;

import java.util.Random;

public class B {
    private String name;
    private int wert;

    public B() {
        name = getClass().getName();
        wert = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return name + " " + wert;
    }
}
