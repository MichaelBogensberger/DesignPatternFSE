package org.htlimst;

public class ConversionFormatNotKnownException extends Exception {
    public ConversionFormatNotKnownException() {
        super("Konvertierung mit der gegeben variante nicht möglich.");
    }
}
