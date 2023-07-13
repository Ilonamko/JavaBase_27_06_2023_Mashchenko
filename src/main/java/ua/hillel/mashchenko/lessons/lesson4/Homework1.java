package ua.hillel.mashchenko.lessons.lesson4;

public class Homework1 {
    public static void main(String[] args) {


        int LeeWarrior = 13;
        int LeeArcher = 24;
        int LeeHorseman = 46;
        int MinWarriot = 9;
        int MinArcher = 35;
        int MinHorseman = 12;
        int LeeArmy = 860;
        double MinArmy = 860 * 1.5;

        int LeeTotalArmy = (LeeWarrior + LeeArcher + LeeHorseman) * LeeArmy;
        int MinTotalArmy = (MinWarriot + MinArcher + MinHorseman) * (int) MinArmy;

        System.out.println("Lee total army = " + LeeTotalArmy);
        System.out.println("Min total army = " + MinTotalArmy);
































    }
}
