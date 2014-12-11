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
    Team[] teams;

    public TeamManager(Olympian[] olympians) {

        shuffleArray(olympians);

        int n = olympians.length;
        teams = new Team[n / 2];
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++)
            used[i] = false;
        for (int i = 0; i < teams.length; i++) {
            Olympian Olympian1 = getUnsedMale(olympians, used);
            if (Olympian1 == null)
                Olympian1 = getUnsedFemale(olympians, used);
            Olympian Olympian2 = getUnsedFemale(olympians, used);
            if (Olympian2 == null)
                Olympian2 = getUnsedMale(olympians, used);

            if (Olympian1 == null)
                System.out.println(Olympian1);
            if (Olympian2 == null)
                System.out.println(Olympian2);

            teams[i] = new Team(Olympian1, Olympian2);

        }

    }

    private Olympian getUnsedMale(Olympian[] olympians, boolean[] used) {
        for (int i = 0; i < olympians.length; i++) {
            if (olympians[i].sex == Sex.MALE && used[i] == false) {
                used[i] = true;
                return olympians[i];
            }
        }
        return null;
    }

    private Olympian getUnsedFemale(Olympian[] olympians, boolean[] used) {
        for (int i = 0; i < olympians.length; i++) {
            if (olympians[i].sex == Sex.FEMALE && used[i] == false) {
                used[i] = true;
                return olympians[i];
            }
        }
        return null;
    }

    // Implementing Fisher–Yates shuffle
    // idk if we were allowed to use this method and i know its only worth 5 points but i just really wanted the shuffle to work for self-fulfillment/ learning purposes.
    static void shuffleArray(Olympian[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Olympian a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
//THE RANDOMIZATION FINALLY WORKS!
    int wins =0;
    int losses=0;
    public Team[] getTeams() {
        for(int i=0;i<teams.length;i++) {
            System.out.println(teams[i].getTeam_olymp1().Name + " and " + teams[i].getTeam_olymp2().Name + wins + "," + losses);

        }
        {
            return teams;
        }
    }
}
