package ua.hillel.mashchenko.lessons.lesson9;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        int[][] array = new int[M][N];
        int[][] array2 = new int[N][M];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[j][i] = array2[i][j];
            }
        }

        System.out.println("Original Matrix:");


        System.out.println("Transposed Matrix:");

        scanner.close();
    }


        }



