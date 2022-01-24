package org.htlimst;

public class EUR2GBP extends WR {

    @Override
    public double umrechnen() throws ConversionFormatNotKnownException {
        if (this.getVariante().equals("EUR2GBP")) {
            return this.getBetrag() * 0.84;
        } else {
            if (this.getNext() != null) {
                this.getNext().setBetrag(this.getBetrag());
                this.getNext().setVariante(this.getVariante());
                return this.getNext().umrechnen();
            } else {
                throw new ConversionFormatNotKnownException();
            }
        }

    }



}
