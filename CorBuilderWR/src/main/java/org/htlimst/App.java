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

        WR handler1 = new WR.Builder().ofType(new EUR2YEN()).withBetrag(20).withVariante("EUR2GBP").build();
        WR handler2 = new WR.Builder().ofType(new EUR2USD()).build();
        WR handler3 = new WR.Builder().ofType(new EUR2GBP()).build();

        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler3.setNext(handler1);

        System.out.println("--------------------------------------");
        System.out.println("               handler1               ");
        System.out.println("Variante: " + handler1.getVariante());
        System.out.println("Betrag: " + handler1.getBetrag());
        System.out.println("Type of: " + handler1.getClass());
        System.out.println("Next: " + handler1.getNext());
        System.out.println("--------------------------------------");

        System.out.println(handler1.umrechnen());






    }
}
