package org.htlimst;

public class EUR2YEN extends WR {

    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {

        if (variante.equals("EUR2YEN")) {
            return betrag * 130.89;
        } else {
            if (this.getNext() != null) {
                return this.getNext().umrechnen(variante, betrag);
            } else {
                throw new ConversionFormatNotKnownException();
            }
        }


    }


}
