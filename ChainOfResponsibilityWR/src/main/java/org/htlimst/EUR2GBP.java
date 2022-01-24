package org.htlimst;

public class EUR2GBP extends WR {

    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {
        if (variante.equals("EUR2GBP")) {
            return betrag * 0.84;
        } else {
            if (this.getNext() != null) {
                return this.getNext().umrechnen(variante, betrag);
            } else {
                throw new ConversionFormatNotKnownException();
            }
        }

    }



}
