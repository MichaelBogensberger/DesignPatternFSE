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
        IUmrechnen simpleHandler1 = new EUR2YEN();
        IUmrechnen simpleHandler2 = new EUR2USD();
        IUmrechnen simpleHandler3 = new EUR2GBP();

        // Chain of Responsibility erstellen
        //hier muss getypecasted werden
        ((WR)simpleHandler1).setNext(simpleHandler2);
        ((WR)simpleHandler2).setNext(simpleHandler3);

        // Simpler Handler --> umrechnen
        System.out.println("EUR2GBP = " + simpleHandler1.umrechnen("EUR2GBP", 20));

        // Decorated Handler erstellen und diesem den simplen Handler übergeben
        IUmrechnen decoratedHandler1 = new FixedGebDecorator(simpleHandler1, 5);
        // umrechnen beim decorated Handler ausführen
        System.out.println("EUR2GBP mit 5 Euro Gebühr = " +  decoratedHandler1.umrechnen("EUR2GBP", 20));


        IUmrechnen decoratedHandler2 = new PercentGebDecorator(simpleHandler1, 50);
        System.out.println("EUR2GBP mit 50 Prozent Gebühr ist = " + decoratedHandler2.umrechnen("EUR2GBP", 20));








    }
}
