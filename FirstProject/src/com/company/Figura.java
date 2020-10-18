package com.company;

public class Figura {
    protected double pole;
    protected double obwod;
    protected String nazwa;

    public Figura() {
        pole = 0;
        obwod = 0;
        nazwa = "";
    }

    public Figura(double pole, double obwod, String nazwa) {
        this.pole = pole;
        this.obwod = obwod;
        this.nazwa = nazwa;
    }

    public double getPole() {
        return pole;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }

    public double getObwod() {
        return obwod;
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "pole=" + pole +
                ", obwod=" + obwod +
                ", nazwa='" + nazwa + '\n' +
                '}';
    }

    public void print() {
        System.out.printf("Figura=" +
                "pole=" + pole +
                ", obwod=" + obwod +
                ", nazwa='" + nazwa + '\n');
    }

    public void setValues (double pole, double obwod) {
        this.pole = pole;
        this.obwod = obwod;
    }
    public String toStringIfHigherThenZero () {
        if (this.pole > 0 && this.obwod > 0) {
            this.print();
        }else {
            System.out.println("wartosci sa mniejsze od zera");
        }
        return null;
    }

    public void setValues (String s) {
        this.nazwa = s;
    }

    public void powieksz(int n) {
        this.pole = pole*n;
        this.obwod = obwod*n;
    }
}
