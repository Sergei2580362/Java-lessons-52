package Lesson6;

public class Converter {
    // eur/usd = 1.02
    // из доллара в евро -> toEur
    // из евр ов доллар -> toUsd
    private double rate;

    public Converter(double rate){
        this.rate = rate;
    }

    public double toEur (double usd) {
        return usd / this.rate;
    }
    public double toUsd (double eur) {
        return eur * this.rate ;
    }
}
