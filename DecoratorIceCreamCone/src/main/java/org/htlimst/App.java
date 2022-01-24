package org.htlimst;

/**
 * Hello world!
 *
 */

public class App{

        private static void printIceCreamFlavors(IceCreamCone iceCreamCone)
        {
            System.out.println("Flavors of the ice cream cone are: " + iceCreamCone.getFlavors());
        }


    public static void main( String[] args )
    {


        IceCreamCone iceCreamCone = new SimpleIceCreamCone();
        printIceCreamFlavors(iceCreamCone);

        iceCreamCone = new ChocolateDecorator(iceCreamCone);
        printIceCreamFlavors(iceCreamCone);

        iceCreamCone = new StrawberryDecorator(iceCreamCone);
        printIceCreamFlavors(iceCreamCone);

    }
}
