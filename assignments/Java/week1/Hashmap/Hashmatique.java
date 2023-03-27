package assignments.Java.week1.Hashmap;

import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

public static void main(String[] args) {

    HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Manana sera Bonito", "Porque manana sera bonito");
        trackList.put("Provenza", "Baby Ques mas?");
        trackList.put("Gatubela", "Aye Que Rico");
        trackList.put("Tus Gafitas", "Dejaste tus gafitas en mi coche");

        String singleSong = trackList.get("Tus Gafitas");
        System.out.println(singleSong);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println("Track:" + " " + key + " "  + "Lyrics:" + " " + trackList.get(key));
            // System.out.println(trackList.get(key));
        }
        // String name = trackList.get("nninja@codingDojo.com");
    }

}