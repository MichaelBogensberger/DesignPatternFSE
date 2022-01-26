package org.htlimst;

public class PercentGebDecorator extends WRdecorator {

    private double percent;

    public PercentGebDecorator(WR wr, double percent) {
        super(wr);
        this.percent = percent;
    }

    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {
        return super.umrechnen(variante, betrag - ((betrag/100)*percent) );
    }


}
