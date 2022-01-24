package org.htlimst;

public class EUR2YEN extends WR {

    @Override
    public double umrechnen() throws ConversionFormatNotKnownException {

        if (this.getVariante().equals("EUR2YEN")) {
            return this.getBetrag() * 130.89;
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
