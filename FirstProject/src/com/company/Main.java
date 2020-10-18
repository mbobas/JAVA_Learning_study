package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Figura figura1 = new Figura();
        figura1.setNazwa("figura1");
        figura1.setObwod(40);
        figura1.setPole(100);
        Figura figura2 = new Figura(0, 0, "kwadrat");

        figura1.toStringIfHigherThenZero();
        figura2.toStringIfHigherThenZero();

        figura1.setNazwa("Kwadrat1");
        figura2.toStringIfHigherThenZero();

        Kolo kolo1 = new Kolo(0, 0, "kolo1", 3);

        Prostokat prostokat = new Prostokat(0, 0, "Prostokat", 10, 10);
        prostokat.powieksz(2);
        KwadratZProstokata kwadratZProstokata = new KwadratZProstokata(0, 0, "KwadratZProstokata", 20);
        kwadratZProstokata.powieksz(2);
        kolo1.powieksz(2);

        Figura[] tabFigura = new Figura[5];
        tabFigura[0] = new KwadratZProstokata(0, 0, "kwadrat", 5);
        tabFigura[1] = new Kolo(0, 0, "KOLOTAB", 15);
        tabFigura[2] = new Prostokat(0, 0, "PROSTAB", 5, 10);
        tabFigura[3] = new Prostokat(0, 0, "PROSTAB2", 5, 10);
        tabFigura[4] = new Prostokat(0, 0, "PROSTAB3", 5, 10);

        for (Figura f : tabFigura) {
            System.out.println(f);
            System.out.println("******");
        }

        for (Figura f : tabFigura) {
            f.powieksz(2);
        }

        List<Figura> listaFigur = new ArrayList<>();
        listaFigur.add(tabFigura[0]);
        listaFigur.add(tabFigura[1]);
        listaFigur.add(tabFigura[2]);
        listaFigur.add(tabFigura[3]);

        int n = listaFigur.size();
        for (int i=0; i<n; i++) {
            System.out.println("lista["+i+"]"+listaFigur.get(i));
        }



    }
}