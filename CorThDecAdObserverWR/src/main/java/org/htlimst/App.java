package org.htlimst;

/**
 * Währungsrechner mit ChainOfResponsibilit, TemplateHook und Decorator Pattern
 * @author  Michael Bogensberger
 * @version 3.0
 */
public class App 
{
    public static void main( String[] args ) throws ConversionFormatNotKnownException {


        /*
         Ich erstelle einen simplenHandler1 der EUR2YEN ist.
         Jetzt sag ich, next ist simpleHandler2 der EUR2USD ist.
         Wenn ich jetzt den decoratedHandler1 erstelle, gebe ich dem
         den simpleHandler1 und eine Gebühr mit.
         Jetzt führe ich umrechnen vom decoratedHandler1 aus. Also geh
         ich jetzt in die Klasse FixedGebDecorator. Dort habe ich ja dem
         Konstruktor den simplenHandler(EUR2YEN) und eine gebühr mitgegeben.
         Nun führe ich umrechnen() aus. die Methode ruft nun die Oberklasse
         (WRdecorator) auf und rechnet bzw gibt umrechnen() von dem simplenHandler
         (EUR2YEN) zurück. (Angenommen dieser ist dafür zuständig, siehe COR)
        */


        // Simple Handler erstellen
        WR simpleHandler1 = new EUR2YEN();
        WR simpleHandler2 = new EUR2USD();
        WR simpleHandler3 = new EUR2GBP();

        KonkreterBeobachter konkreterBeobachter = new KonkreterBeobachter(simpleHandler1);

        // Chain of Responsibility erstellen
        //hier muss getypecasted werden
        (simpleHandler1).setNext(simpleHandler2);
        (simpleHandler2).setNext(simpleHandler3);


        // Simpler Handler --> umrechnen
        //System.out.println("EUR2YEN = " + simpleHandler1.umrechnen("EUR2USD", 20));










        // Decorated Handler erstellen und diesem den simplen Handler übergeben
        IUmrechnen decoratedHandler1 = new FixedGebDecorator(simpleHandler1, 5);
        // umrechnen beim decorated Handler ausführen
        System.out.println("EUR2GBP mit 5 Euro Gebühr = " +  decoratedHandler1.umrechnen("EUR2GBP", 20));



    /*
        SammelrechnungAdapter sammelrechnungAdapter = new SammelrechnungAdapter(simpleHandler1);
        System.out.println(sammelrechnungAdapter.sammelumrechnung("EUR2YEN",new double[]{5,5,5,5}));
    */

        /*
        IUmrechnen decoratedHandler2 = new PercentGebDecorator(simpleHandler1, 50);
        System.out.println("EUR2GBP mit 50 Prozent Gebühr ist = " + decoratedHandler2.umrechnen("EUR2GBP", 20));
        */







    }
}
