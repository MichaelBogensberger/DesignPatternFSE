package org.htlimst;


import com.sun.jmx.snmp.Timestamp;

import java.util.*;

public abstract class WR extends Observable implements IUmrechnen  {

    private IUmrechnen next;
    Map<String, String> log = new HashMap<String, String>();




    public abstract double calculate(double betrag);
    public abstract boolean compareTypes(String variante);

    public double passNextHandler(String variante, double betrag) throws ConversionFormatNotKnownException {
        if (this.getNext() != null) {

            log.put("calculated" , Double.toString(this.getNext().umrechnen(variante, betrag)));
            this.setChanged();
            this.notifyObservers(log);

            return this.getNext().umrechnen(variante, betrag);
        } else {
            throw new ConversionFormatNotKnownException();
        }
    }


    @Override
    public double umrechnen(String variante, double betrag) throws ConversionFormatNotKnownException {


        log.put("ausgangsbetrag", Double.toString(betrag));
        log.put("variante", variante);
        log.put("time", new Timestamp(System.currentTimeMillis()).toString());


        if(compareTypes(variante)) {
            log.put("calculated" , Double.toString(calculate(betrag)));
            this.setChanged();
            this.notifyObservers(log);
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
