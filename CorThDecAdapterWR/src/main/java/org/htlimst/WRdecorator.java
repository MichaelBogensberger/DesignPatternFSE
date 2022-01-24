package org.htlimst;

public abstract class WRdecorator implements IUmrechnen {
    private IUmrechnen iumrechner;

    public WRdecorator(IUmrechnen iumrechner) {
        this.iumrechner = iumrechner;
    }

    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {
        return iumrechner.umrechnen(variante, betrag);
    }





}
