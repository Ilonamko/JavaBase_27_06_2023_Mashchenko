package ua.hillel.mashchenko.lessons.lesson7;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {

        int [] team1Age = new int[25];
        for (int i = 0; i < team1Age.length; i++) {
            team1Age[i] = (int) (Math.random() * 23) + 18;
        }

        for (int i = 0; i < team1Age.length; i++) {

        }
        System.out.println(Arrays.toString(team1Age));

        int sumTeam1age = 0;
        for (int i = 0; i < team1Age.length; i ++) {
            sumTeam1age += team1Age[i];
        }

        int average = sumTeam1age / 25;
        System.out.println("Average age of the team 1 : " + average);

        int [] team2Age = new int[25];
        for (int i = 0; i < team2Age.length; i++) {
            team2Age[i] = (int) (Math.random() * 23) + 18;
        }

        for (int i = 0; i < team2Age.length; i++) {

        }
        System.out.println(Arrays.toString(team2Age));

        int sumTeam2age = 0;
        for (int i = 0; i < team2Age.length; i++) {
            sumTeam2age += team2Age[i];
        }

        int average2 = sumTeam2age / 25;
        System.out.println("Average age of the team 2 : " + average2);














    }
}
