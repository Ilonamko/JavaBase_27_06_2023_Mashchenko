package ua.hillel.mashchenko.lessons.lesson7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //int[] array = new int[5];
//
//       System.out.println(array.length); //довжина массиву
//       System.out.println(array);
//
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);


//        int[] array = {1,2,3,4,5};
//        int[] array2 = new int[]{1,2,3,4,5};
//
//        System.out.println(array[4]);

//        int[] array = new int [10];
//
//        System.out.println(0);
//        System.out.println(2);

//        int[] array = new int[25];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
////
//
//        System.out.println(Arrays.toString(array));

//

//        int[] array = new int[0];
//        int[] array2 =

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (i = array.length - 1) {
//            } else {
//                System.out.println(array[i] + ", ");


        int[] people = new int {11, 44, 98, 44, 22, 33, 44, 91};
        for (int i = 0; i < people.length; i++) {
            people[i] = (int) (Math.random() * 101);

        }

        int max = people[0];

        for (int i = 0; i < people.length; i++) {
            if (max < people[i]) {
                max = people[i];

            }

        }

        System.out.println("max chance: " + max);







    }
}














