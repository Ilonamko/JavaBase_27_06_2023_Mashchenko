package ua.hillel.mashchenko.lessons.lesson6;

public class Homework1 {

    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; i <= 155; i++) {

            if (i / 100 == 4 || i / 100 == 9 || i % 10 == 4 || i % 10 == 9 || (i % 100) / 10 == 4 || (i % 100) / 10 == 9) {
                continue;
            }

            System.out.println(i);
            counter++;


        }
        System.out.println(counter);
    }
}
