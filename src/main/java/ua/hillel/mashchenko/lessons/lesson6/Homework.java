package ua.hillel.mashchenko.lessons.lesson6;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userValue = 5;

        System.out.println("Please enter from 0 to 10");

        while (true) {
            if (scanner.hasNextInt()) {
                userValue = scanner.nextInt();
                if (userValue == 5) {
                    break;
                } else {
                    System.out.println("Wrong guess! 2 tries left!");
                    scanner.nextLine();
                }
                if (scanner.hasNextInt()) {
                    userValue = scanner.nextInt();
                    if (userValue == 5) {
                        break;
                    } else {
                        System.out.println("Wrong guess! 1 try left!");
                        scanner.nextLine();
                    }
                    if (scanner.hasNextInt()) {
                        userValue = scanner.nextInt();
                        if (userValue == 5) {
                            break;
                        } else {
                            System.out.println("LOOSER!");
                            scanner.nextLine();
                        }
                    }

                }

            }

        }

                System.out.println("user value = " + userValue);


    }
}
