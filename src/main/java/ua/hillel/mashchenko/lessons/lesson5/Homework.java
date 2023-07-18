package ua.hillel.mashchenko.lessons.lesson5;


import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {


        int chicagoBullsTeam = 5;
        int cbPlayer1 = 3;
        int cbPlayer2 = 5;
        int cbPlayer3 = 5;
        int cbPlayer4 = 5;
        int cbPlayer5 = 2;

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int team1 = scanner.nextInt();
        System.out.println(team1);
        System.out.println(str);


        if (scanner.hasNextInt()) {
            cbPlayer1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Chicago Bulls Player 1 = " + cbPlayer1);

        if (scanner.hasNextInt()) {
            cbPlayer2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Chicago Bulls Player 2 = " + cbPlayer2);

        if (scanner.hasNextInt()) {
            cbPlayer3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Chicago Bulls Player 3 = " + cbPlayer3);

        if (scanner.hasNextInt()) {
            cbPlayer4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Chicago Bulls Player 4 = " + cbPlayer4);

        if (scanner.hasNextInt()) {
            cbPlayer5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Chicago Bulls Player 5 = " + cbPlayer5);

        int losAngelesLakersTeam = 5;
        int lalPlayer1 = 2;
        int lalPlayer2 = 5;
        int lalPlayer3 = 3;
        int lalPlayer4 = 3;
        int lalPlayer5 = 2;


        int team2 = scanner.nextInt();
        System.out.println(team2);
        System.out.println(str);

        if (scanner.hasNextInt()) {
            lalPlayer1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Los Angeles Lakers Player 1 = " + lalPlayer1);

        if (scanner.hasNextInt()) {
            lalPlayer2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Los Angeles Lakers Player 2 = " + lalPlayer2);

        if (scanner.hasNextInt()) {
            lalPlayer3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Los Angeles Lakers Player 3 = " + lalPlayer3);

        if (scanner.hasNextInt()) {
            lalPlayer4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Los Angeles Lakers Player 4 = " + lalPlayer4);

        if (scanner.hasNextInt()) {
            lalPlayer5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);

        }

        System.out.println("Los Angeles Lakers Player 5 = " + lalPlayer5);


        int chicagoBullsAvg = (cbPlayer1 + cbPlayer2 + cbPlayer3 + cbPlayer4 + cbPlayer5) / chicagoBullsTeam;
        System.out.println("Chicago Bulls Avg = " + chicagoBullsAvg);
        int losAngelesLakersAvg = (lalPlayer1 + lalPlayer2 + lalPlayer3 + lalPlayer4 + lalPlayer5) / losAngelesLakersTeam;
        System.out.println("Los Angeles Lakers Avg = " + losAngelesLakersAvg);

        if (chicagoBullsAvg == losAngelesLakersAvg) {
            System.out.println("Draw!");

        } else if (chicagoBullsAvg > losAngelesLakersAvg) {
           System.out.println("Chicago Bulls Win!");

        } else {
          System.out.println("Los Angeles Lakers Win!");
        }

        System.out.println("Winning Team = " + team1 + " gained " + chicagoBullsAvg + " poins ");
        }
}

