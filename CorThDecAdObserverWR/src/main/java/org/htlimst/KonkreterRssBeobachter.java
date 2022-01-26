package org.htlimst;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndFeedImpl;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

public class KonkreterRssBeobachter implements Observer {

    private WR wr;

    public KonkreterRssBeobachter(WR wr) {
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
            File fileObj = new File("RssLog.txt");
            FileWriter myWriter = new FileWriter("RssLog.txt", true);

            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
            }

            SyndFeed feed = new SyndFeedImpl();
            feed.setFeedType("atom_1.0");
            feed.setTitle("WR Log");
            feed.setDescription(arg.toString());


            SyndFeedOutput syndFeedOutput = new SyndFeedOutput();
            syndFeedOutput.output(feed, myWriter);
            myWriter.close();

        } catch (IOException | FeedException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

}
