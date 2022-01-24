package org.htlimst;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ConversionFormatNotKnownException {

        // von yen ist der next --> usd
        // von usd ist der next --> gbp

        EUR2YEN handler1 = new EUR2YEN();
        EUR2USD handler2 = new EUR2USD();
        EUR2GBP handler3 = new EUR2GBP();

        handler1.setNext(handler2);
        handler2.setNext(handler3);




        System.out.println("EUR2YEN: " + handler1.umrechnen("EUR2YEN", 22));
        System.out.println("EUR2USD: " + handler1.umrechnen("EUR2USD", 22));
        System.out.println("EUR2GBP: " + handler1.umrechnen("EUR2GBP", 22));


    }
}
