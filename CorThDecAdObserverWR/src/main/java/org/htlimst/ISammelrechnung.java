package org.htlimst;

public interface ISammelrechnung {

    public double sammelumrechnung(String variante, double betraege[]) throws ConversionFormatNotKnownException;

}
