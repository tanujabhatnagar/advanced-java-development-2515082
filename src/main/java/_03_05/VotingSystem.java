package _03_05;

import java.util.LinkedHashMap;

public class VotingSystem {

    // Create a LinkedHashMap here, with the contestant name as the key
    // and the number of votes as the value.
    LinkedHashMap<String,Integer> contestants=new LinkedHashMap<>();

    void vote(String contestant) {
        // Implement this method so that a new contestant is added to the map if it's
        // not already there. If it is already there, increment the value by one.
        contestants.put(contestant,contestants.containsKey(contestant) ? contestants.get(contestant) + 1:(Integer) 1 );
    }

    // This method should return the LinkedHashMap field you create at the top of
    // the class.
    public LinkedHashMap getVotes() {
        return contestants;
    }


}
