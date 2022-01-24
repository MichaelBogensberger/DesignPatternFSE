package org.htlimst;

public class FixedGebDecorator extends WRdecorator {
    private double gebuehr;

    public FixedGebDecorator(IUmrechnen iumrechner, double gebuehr) {
        super(iumrechner);
        this.gebuehr = gebuehr;
    }

    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {
        return super.umrechnen(variante, betrag-gebuehr);
    }


}
