package org.htlimst;

public class EUR2USD extends WR {


    @Override
    public double calculate(double betrag) {
        return betrag * 1.14;
    }

    @Override
    public boolean compareTypes(String variante) {
        return variante.equals("EUR2USD");
    }

}
