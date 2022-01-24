package org.htlimst;

public class EUR2USD extends WR {

    @Override
    public double umrechnen() throws ConversionFormatNotKnownException {
        if (this.getVariante().equals("EUR2USD")) {
            return this.getBetrag() * 1.14;
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
