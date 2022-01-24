package org.htlimst;

public class EUR2GBP extends WR {


    @Override
    public double calculate(double betrag) {
        return betrag * 0.84;
    }

    @Override
    public boolean compareTypes(String variante) {
        return variante.equals("EUR2GBP");
    }

}
