package org.htlimst;

public abstract class WRdecoder implements WR{
    private WR wr;

    public WRdecoder(WR wr) {
        this.wr = wr;
    }

    @Override
    public abstract double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException;

}
