package com.cmpt220.project3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Random;

/**
 * Created by Zain on 11/13/2014.
 */
public class TeamManager {
    OlympianManager xyz;
    // Your team array declaration goes here
    Team[] team_array;

    public TeamManager(OlympianManager man) {
        this.xyz = man;
        team_array = new Team[xyz.olympian.size()/2];
    }
    public void Teams() {
        int teamcount = 0;
        Olympian tempFirst = null, tempSecond;
        ArrayList<Olympian> templist = new ArrayList<Olympian>(xyz.olympian);

        Random rand = new Random();
        while (!(templist.size() == 0)) {
            int current = rand.nextInt() % templist.size();
            Olympian temp = templist.get(current);

            if(tempFirst==null){
                tempFirst= new Olympian(temp.Name,temp.sex,temp.age);
                templist.remove(current);
            }
            else if (xyz.maleCount==xyz.femaleCount) {
                if (tempFirst.sex != temp.sex) {
                    tempSecond= new Olympian(temp.Name,temp.sex,temp.age);
                    templist.remove(current);
                    team_array[teamcount] = new Team(tempFirst,tempSecond);
                    tempFirst = null;
                    tempSecond = null;
                    teamcount++;
                }
            }


        else {
            tempSecond= new Olympian(temp.Name,temp.sex,temp.age);
            templist.remove(current);
            team_array[teamcount] = new Team(tempFirst,tempSecond);
            tempFirst = null;
            tempSecond = null;
            teamcount++;
        }

    }




    //Set up a Team object.
            //Another WHILE loop with a flag that symbolizes the team being made.
            //Pick one player at random using templist.get(YOUR RANDOM NUMBER)
            //Check that it is the required sex
            //If satisfactory, add it to the team you declared above
            //If you just completed the team, then set the flag so that the while loop will end
            //REPEAT UNTIL ALL TEAMS ARE DONE
            //(Obviously, add the team to the array above.)
            // Your random numbers need to be bound between 0 and list.size() - 1
            //ints(int randomNumberOrigin, int randomNumberBound)
        }



        //public static void main(String[] args){
//randomize players and make teams (not done yet)

        //OlympianManager xyz = new OlympianManager();
        //int i = 0;
        // System.out.println(xyz.olympian);
        // Collections.sort(xyz.olympian);

    }

