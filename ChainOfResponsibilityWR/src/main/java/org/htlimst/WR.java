package org.htlimst;

import java.util.ArrayList;

public abstract class WR implements IUmrechnen {

    private WR next;

    @Override
    public abstract double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException;

    public WR getNext() {
        return next;
    }

    public void setNext(WR next) {
        this.next = next;
    }

}
