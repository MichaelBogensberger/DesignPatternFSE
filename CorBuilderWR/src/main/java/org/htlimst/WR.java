package org.htlimst;

public abstract class WR implements IUmrechnen {
    private String variante;
    private double betrag;

    private WR next;

    @Override
    public abstract double umrechnen() throws ConversionFormatNotKnownException;

    public WR getNext() {
        return next;
    }

    public void setNext(WR next) {
        this.next = next;
    }


    public static class Builder {
        private String variante;
        private double betrag;
        private WR type;

        public Builder withVariante(String variante) {
            this.variante = variante;
            return this;
        }

        public Builder withBetrag(double betrag) {
            this.betrag = betrag;
            return this;
        }

        public Builder ofType(WR next) {
            this.type = next;
            return this;
        }

        public WR build() {
            WR wr = type;
            wr.setVariante(this.variante);
            wr.setBetrag(this.betrag);
            return wr;
        }

    }



    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }



}
