package com.example.firstproject;

import java.util.ArrayList;
import java.util.List;

public class A {
    private List<B> bListe;

    public A(int n) {
        bListe = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bListe.add(new B());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (B b : bListe) {
            sb.append(b.toString()).append("\n");
        }
        return sb.toString();
    }
}

