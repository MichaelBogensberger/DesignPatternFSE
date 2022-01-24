package org.htlimst;

public class SammelrechnungAdapter implements ISammelrechnung {

    private WR wr;

    public SammelrechnungAdapter(WR wr) {
        this.wr = wr;
    }

    @Override
    public double sammelumrechnung(String variante, double[] betraege) throws ConversionFormatNotKnownException {
        double erg = 0;

        for(double betrag : betraege) {
            erg = erg + wr.umrechnen(variante, betrag);
        }
        return erg;

    }

}
