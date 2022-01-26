package org.htlimst;

public abstract class WRdecorator implements IUmrechnen {
    private WR wr;

    public WRdecorator(WR wr) {
        this.wr = wr;
    }

    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {
        return wr.umrechnen(variante, betrag);
    }





}
