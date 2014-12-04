package com.cmpt220.project3;

/**
 * Created by Zain on 12/3/2014.
 */
public class Event {
    public static String[] events = new String[] {"Washoos", "CanJam", "Horseshoes", "Cornhole", "Ladderball","Stickgame" };

    public String getEvents(){
        for(int i =0; i < events.length; i++){
            System.out.println(events[i]);

        }
        return null;
    }

}
