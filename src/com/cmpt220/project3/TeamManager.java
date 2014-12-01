package com.cmpt220.project3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Zain on 11/13/2014.
 */
public class TeamManager {
    OlympianManager xyz = new OlympianManager();
    TeamManager<Olympian> abc = new TeamManager()<Olympian>;

    int readLines() throws IOException {
        FileReader file_lgoo = new FileReader(xyz.path);
        BufferedReader bf = new BufferedReader(file_lgoo);
        String aLine;
        int numberOfLines= 0;
        while ( ( aLine = bf.readLine( ) ) != null ) {
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;
    //public static void main(String[] args){
//randomize players and make teams (not done yet)

        //OlympianManager xyz = new OlympianManager();
        //int i = 0;
       // System.out.println(xyz.olympian);
       // Collections.sort(xyz.olympian);
        System.out.println("The new order:");
             for (int i = 0; i < xyz.olympian.size(); i++)
        System.out.println(xyz.olympian.get(i));
        }
     }






