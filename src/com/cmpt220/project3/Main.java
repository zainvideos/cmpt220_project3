package com.cmpt220.project3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
public class Main {

    public static void main(String[] args)throws IOException {


        OlympianManager olympian_manager=new OlympianManager();
        Olympian[] olympians=olympian_manager.getOlympians();

        TeamManager team_manager=new TeamManager(olympians);
        Team[] teams=team_manager.getTeams();




        Event evm = new Event();
        //teamManager.Teams();



        //app welcome message
        System.out.println("Welcome To the Smith Family Olympics App. Enter a command or press h for help.");
        System.out.println("Please enter a command or type h for help");

        if (args.length == 0)
            System.out.println("You need to select an option.... are you feeling ok?");
        else if (args[0].equals("o") || args[0].equals("olympians")) {
            //try {

            //print list of olympians
// to fix the print without args issue, i would put the println loop here
            olympian_manager.getOlympians();
//for debugging:
//System.out.println(xyz.olympian.size());
        }
        else if (args[0].equals("e") || args[0].equals("events")) {
            evm.getEvents();
        }
        else if (args[0].equals("t") || args[0].equals("teams")) {


           team_manager.getTeams();
        }
        else if (args[0].equals("q") || args[0].equals("quit")) {
            //quits app
            System.out.println("Good Bye");
            System.exit(0);
        }
        else if(args[0].equals("h")||args[0].equals("help")) {
            System.out.println("Type e for list of events, type o for a list of olympians, t for list of teams, and q to quit.");
        }


// try {
  //          OlympianManager.main(args);
    //    } catch (IOException e) {
      //      e.printStackTrace();
        //}

        //OlympianManager olympianManager = new OlympianManager(args[0]);
        //OlympianManager olympianManager = new OlympianManager(args[0]);
       /* if (0 < args.length) {
            String filename = args[0];
            File file = new File(filename);
        }*/
        // System.out.println(.filename);
//olympianManager. = System.in;
        //olympianManager = new OlympianManager(args[0]);
       // System.out.println(.filename);
//olympianManager. = System.in;
        //olympianManager = new OlympianManager(args[0]);
    }
}
