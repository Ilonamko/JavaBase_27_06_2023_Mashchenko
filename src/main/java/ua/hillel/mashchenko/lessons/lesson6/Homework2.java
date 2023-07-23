package ua.hillel.mashchenko.lessons.lesson6;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {
        public static void main(String[] args) {

            int attempts = 3;
            int secretNumber = (int) (Math.random() * 11);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hi! Enter a number between 0 and 10.");
            System.out.println("You have " + attempts + " attempts.");

            for (int attempt = 1; attempt <= attempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your number: ");
                int guess = scanner.nextInt();

                if (guess == secretNumber) {
                    System.out.println("You won! The correct number is " + secretNumber);
                    break;
                } else if (attempt < attempts) {
                    System.out.println("Wrong number. Try again!");
                } else {
                    System.out.println("Sorry, you failed. The correct number was: " + secretNumber);
                }
            }

            scanner.close();
        }

        private static int generateRandomNumber(int min, int max) {
            return (int) (Math.random() * (max - min + 1)) + min;
        }
    }

