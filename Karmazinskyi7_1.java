package com.karmazinskyi.lessons.lesson7;

import java.util.Arrays;

public class Karmazinskyi7_1 {
    public static void main(String[] args) {

        final int COUNT_PLAYERS = 25;

        int team1[] = new int[COUNT_PLAYERS];
        double sumteam1 = 0;
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * 23) + 18;
            sumteam1 += team1[i];
        }
        System.out.println(Arrays.toString(team1));
        System.out.println("Average age of team 1 = " + sumteam1 / 25);

        int team2[] = new int[COUNT_PLAYERS];
        double sumteam2 = 0;
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) (Math.random() * 23) + 18;
            sumteam2 += team2[i];
        }
        System.out.println(Arrays.toString(team2));
        System.out.println("Average age of team 2 = " + sumteam2 / 25);
    }

}

