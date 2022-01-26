package org.htlimst;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

public class KonkreterBeobachter implements Observer {

    private WR wr;

    public KonkreterBeobachter(WR wr) {
        this.wr = wr;

        // Durchführung der Registrierung beim übergebenen Subjekt
        this.wr.addObserver(this);
    }


    public void update(Observable o, Object arg) {
        //int newState = wr.getState();

        //HashMap<String, String> log = (HashMap)arg;
        // System.out.println(log.get("variante"));
        // System.out.println("OBSERVER umgerechnet" + arg);

        try {
            File fileObj = new File("log.txt");
            FileWriter myWriter = new FileWriter("log.txt", true);

            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
            }

            myWriter.write("\n---------------------- LOG eintrag ----------------------\n");
            myWriter.write(arg.toString());
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

}
