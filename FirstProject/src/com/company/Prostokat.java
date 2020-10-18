package com.company;

public class Prostokat extends Figura  {

    protected int bokA;
    protected int bokB;

    public Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.calculateObwod();
        this.calculatePole();
        this.print();
    }

    public Prostokat(double pole, double obwod, String nazwa, int bokA, int bokB) {
        super(pole, obwod, nazwa);
        this.bokA = bokA;
        this.bokB = bokB;
        this.calculateObwod();
        this.calculatePole();
        this.print();
    }

    public Prostokat() {

    }



    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public void returnPole() {
        System.out.println("Pole: " + this.pole );
    }
    public void returnObwod() {
        System.out.println("Pole: " + this.obwod );
    }

    public void calculatePole() {
        this.pole = this.bokA*this.bokB;
    }
    public void calculateObwod() {
        this.obwod = 2*this.bokA+2*this.bokB;
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", pole=" + pole +
                ", obwod=" + obwod +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public void powieksz(int n) {
        this.bokA = this.bokA*n;
        this.bokB = this.bokB*n;
        calculatePole();
        calculateObwod();
        this.print();
    }
}