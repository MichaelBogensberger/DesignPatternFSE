package org.htlimst;

public abstract class WR implements IUmrechnen {

    private IUmrechnen next;

    public abstract double calculate(double betrag);
    public abstract boolean compareTypes(String variante);

    public double passNextHandler(String variante, double betrag) throws ConversionFormatNotKnownException {
        if (this.getNext() != null) {
            return this.getNext().umrechnen(variante, betrag);
        } else {
            throw new ConversionFormatNotKnownException();
        }
    }


    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {
        if(compareTypes(variante)) {
            return calculate(betrag);
        } else {
           return passNextHandler(variante, betrag);
        }

    }




    public IUmrechnen getNext() {
        return next;
    }

    public void setNext(IUmrechnen next) {
        this.next = next;
    }





}
