package com.company;

public class Kolo extends Figura  {

    protected int promien;

    public Kolo(int promien) {
        this.promien = promien;
        this.calculateObwod();
        this.calculatePole();
        this.print();
    }

    public Kolo(int pole, int obwod, String nazwa, int promien) {
        super(pole, obwod, nazwa);
        this.promien = promien;
        this.calculateObwod();
        this.calculatePole();
        this.print();
    }

    public int getPromien() {
        return promien;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }

    public void calculatePole() {
        //Pi * r^2
        this.pole = Math.PI*(this.promien*this.promien);
        System.out.println("Pole = " + this.getPole());
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "promien=" + promien +
                ", pole=" + pole +
                ", obwod=" + obwod +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }

    public void calculateObwod() {
        //Pi * r^2
        this.obwod = 2*Math.PI*this.promien;
        System.out.println("Obwod = " + this.getObwod());
    }
    public void powieksz(int n) {
        this.promien = this.promien*n;
        calculatePole();
        calculateObwod();
        this.print();
    }

}
