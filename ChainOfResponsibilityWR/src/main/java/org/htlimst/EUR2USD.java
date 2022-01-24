package org.htlimst;

public class EUR2USD extends WR {

    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {
        if (variante.equals("EUR2USD")) {
            return betrag * 1.14;
        } else {
            if (this.getNext() != null) {
                return this.getNext().umrechnen(variante, betrag);
            } else {
                throw new ConversionFormatNotKnownException();
            }
        }

    }

}
