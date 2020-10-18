package com.company;

public class KwadratZProstokata extends  Prostokat {
    public KwadratZProstokata(int bokA) {
        super(bokA, bokA);
        this.bokB = bokA;
    }

    public KwadratZProstokata(double pole, double obwod, String nazwa, int bokA) {
        super(pole, obwod, nazwa, bokA, bokA);
        this.bokB = bokA;
    }

    @Override
    public String toString() {
        return "KwadratZProstokata{" +
                "bokA=" + bokA +
                ", pole=" + pole +
                ", obwod=" + obwod +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
