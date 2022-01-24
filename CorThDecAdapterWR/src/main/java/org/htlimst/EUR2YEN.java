package org.htlimst;

public class EUR2YEN extends WR {


    @Override
    public double calculate(double betrag) {
        return betrag * 130.89;
    }

    @Override
    public boolean compareTypes(String variante) {
        return variante.equals("EUR2YEN");
    }



}
