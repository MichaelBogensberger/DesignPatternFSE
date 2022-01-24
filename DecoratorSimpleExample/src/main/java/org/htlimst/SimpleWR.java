package org.htlimst;

public class SimpleWR implements WR{

    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {
        return betrag;
    }

}
