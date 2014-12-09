package com.cmpt220.project3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Random;

/**
 * Created by Zain on 11/13/2014.
 */
public class TeamManager {
    OlympianManager xyz;
    //  team array declaration goes here
   // creating new team array
    Team[] team_array;



    public TeamManager(OlympianManager man) {
        try {
            man.readLines();
            man.OpenFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.xyz = man;
        //assigning team array size
        team_array = new Team[xyz.olympian.size()/2];

        //System.out.println(xyz.olympian.size());
        System.out.println("t" + team_array.length);
    }



    public void Teams() {
        int teamcount = 0;
        Olympian tempFirst = null, tempSecond;
        ArrayList<Olympian> templist = new ArrayList<Olympian>(xyz.olympian);

        Random rand = new Random();
        int current = 0;
        for (int i = 0; i < templist.size() / 2; i++) {
            current = rand.nextInt(templist.size());
            //team_array[i] =
            Olympian p1 = templist.get(current);
            Olympian p2 = null;
            templist.remove(current);
            boolean found = false;
            int olympindex = 0;
            while (!found) {
                if (templist.get(olympindex).sex != p1.sex) {
                    p2 = templist.get(olympindex);
                    templist.remove(p2);
                    found = true;
                }

                olympindex++;
            }
            team_array[i]= new Team(p1, p2);
        }
    }

        //old method
        /*while ((templist.size() != 0)) {
          //  System.out.println("first templist size" + templist.size());
            int current = rand.nextInt(templist.size()) ;
            System.out.println("temp" + current);
            Olympian temp = templist.get(current);

            if(tempFirst==null){
                tempFirst=new Olympian(temp.Name,temp.sex,temp.age);
                        //templist.get(current);
                templist.remove(current);
            }
            else if (xyz.maleCount==xyz.femaleCount) {
                if (tempFirst.sex != temp.sex) {
                    tempSecond= new Olympian(temp.Name,temp.sex,temp.age);
                   // System.out.println("BOOO" + tempSecond.Name);
                    templist.remove(current);
                    team_array[teamcount] = new Team(tempFirst,tempSecond);
                    tempFirst = null;
                    //tempSecond = null;

                    teamcount++;
                }

            }


        else {
            tempSecond= new Olympian(temp.Name,temp.sex,temp.age);
            templist.remove(current);
            team_array[teamcount] = new Team(tempFirst,tempSecond);

              //
           // tempFirst = null;
           // tempSecond = null;
                System.out.println(team_array[teamcount].team_olymp2.age + "HEY MAN");
            teamcount++;
        }

    }}

 */

public Array getTeams(){
    int i;
    for ( i=0; i < team_array.length; i++ ) {
System.out.println(team_array[i].team_olymp1.Name);
        System.out.println(team_array[i].team_olymp2.Name);
//team_array.length()
    }
     return null;
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



