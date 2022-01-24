package org.htlimst;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ConversionFormatNotKnownException {

        WR simpleWR = new SimpleWR();
        System.out.println(simpleWR.umrechnen("a",20));


        WR fixedWR = new FixedGebDecorator(simpleWR, 5);
        System.out.println(fixedWR.umrechnen("a",20));

    }
}
