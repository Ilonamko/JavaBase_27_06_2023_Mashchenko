package ua.hillel.mashchenko.lessons.lesson5;


public class Homework {

    public static void main(String[] args) {

        String team1 = "Chicago Bulls";
        int chicagoBullsTeam = 5;
        int cbPlayer1 = 3;
        int cbPlayer2 = 5;
        int cbPlayer3 = 5;
        int cbPlayer4 = 5;
        int cbPlayer5 = 2;

        String team2 = "Los Angeles Lakers";
        int losAngelesLakersTeam = 5;
        int lalPlayer1 = 2;
        int lalPlayer2 = 5;
        int lalPlayer3 = 3;
        int lalPlayer4 = 3;
        int lalPlayer5 = 2;

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

