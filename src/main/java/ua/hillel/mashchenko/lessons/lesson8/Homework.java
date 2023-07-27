package ua.hillel.mashchenko.lessons.lesson8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[7];
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = (int) (Math.random() * 10);

        }
        int[] playerNumbers = new int[7];
        for (int i = 0; i < playerNumbers.length; i++) {
            playerNumbers[i] = (int) (Math.random() * 10);
        }

        System.out.println("Lottery Numbers: " + Arrays.toString(lotteryNumbers));
        System.out.println("Player Numbers:  " + Arrays.toString(playerNumbers));

        Arrays.sort(lotteryNumbers);
        Arrays.sort(playerNumbers);

        System.out.println(Arrays.toString(lotteryNumbers));
        System.out.println(Arrays.toString(playerNumbers));
        

        int matchingCount = 0;
        int i = 0;
        int j = 0;

        while (i < lotteryNumbers.length && j < playerNumbers.length) {
            if (lotteryNumbers[i] == playerNumbers[j]) {
                matchingCount++;
                i++;
                j++;
            } else if (lotteryNumbers[i] < playerNumbers[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("Matching elements: " + matchingCount);

    }


    }








