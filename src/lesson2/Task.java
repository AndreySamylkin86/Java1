package lesson2;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

// Задание 1

        int [] arrA = {0, 1, 1, 0, 1, 0, 0, 1};
        System.out.println(" Задание 1 \n" + Arrays.toString(arrA));

        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] == 0)
                arrA[i] = 1;
            else
                arrA[i] = 0;
        }
        System.out.println(Arrays.toString(arrA));

// Задание 2

        int [] arrB = new int [7];
        int count = 0;
        for (int i = 0; i < arrB.length ; i++) {
            arrB[i] = count;
            count += 3;
        }
        System.out.println("\n Задание 2 \n" + Arrays.toString(arrB));

// Задание 3

        int [] arrC = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("\n Задание 3 \n" + Arrays.toString(arrC));
        for (int i = 0; i < arrC.length ; i++) {
            if (arrC[i]< 6)
                arrC[i] *=2;
        }
        System.out.println(Arrays.toString(arrC));

// Задание 4

        System.out.println("\n Задание 4");

        int [] [] arrD = new int[6][6];
        for (int i = 0; i < arrD.length ; i++) {
            for (int j = 0; j < arrD [i].length; j++) {
                if (i == j)
                    arrD [i][j] = 1;
            }
            int dioganal2 = arrD [i].length -1 - i;
            for (int j = 0; j < arrD [i].length; j++) {
                if (j == dioganal2)
                    arrD [i][j] = 1;
            }
            System.out.println(Arrays.toString(arrD[i]));
        }

// Задание 5

        int [] arrE = {15,-8, 1441, 13, -959, 1445, 965, 4, 165};
        int max = arrE[0];
        int min = arrE[0];
        for (int i = 0; i < arrE.length; i++) {
            if (arrE[i] > max)
                max = arrE[i];
            if (arrE[i] < min)
                min = arrE[i];
        }

        System.out.println("\n Задание 5 \n" + Arrays.toString(arrE));
        System.out.println("Максимальное значение " + max);
        System.out.println("Минимальное значение " + min);

// Задание 6

        System.out.println("\n Задание 6");
        int [] arrF = { 1, 1, 1, 2, 1};
        System.out.println(Arrays.toString(arrF));
        System.out.println("Сумма левой и правой части массива равны? Ответ - " + checkBalance(arrF));


// Задание 7

        System.out.println("\n Задание 7");
        int [] arrG = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Сместить массив на 3 значения влево");
        System.out.println("Массив до    " + Arrays.toString(arrG));
        System.out.println("Массив после " + Arrays.toString(arrayPlusN(arrG, -3)));
        System.out.println();

        System.out.println("Сместить массив на 3 значения вправо");
        System.out.println("Массив до    " + Arrays.toString(arrG));
        System.out.println("Массив после " + Arrays.toString(arrayPlusN(arrG, 3)));

    }

    // Задание 6

    public static boolean checkBalance(int[] array) {
        int sumBefore = 0;
        int sumAfter = 0;
        for (int i = 0; i < array.length; i++) {
            sumBefore +=array[i];
            sumAfter = 0;
            for (int j = i+1; j < array.length; j++) {
                sumAfter +=array[j];
            }
            if (sumBefore == sumAfter)
                return true;
        }
        return false;
    }

    // Задание 7

    public static int [] arrayPlusN(int [] array, int n) {
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                int g = 0;
                int m = array[0];
                array[0] = array[array.length - 1];
                for (int i = 0; i < array.length - 1; i++) {
                    g = array[i + 1];
                    array[i + 1] = m;
                    i++;
                    m = array[i + 1];
                    array[i + 1] = g;
                }
            }
        }
        else if (n < 0) {
            n = n * (-1);
            for (int j = 0; j < n; j++) {
                int g = 0;
                int m = array[array.length - 1];
                array[array.length - 1] = array[0];
                for (int i = array.length - 1; i > 0; i--) {
                    g = array[i - 1];
                    array[i - 1] = m;
                    i--;
                    m = array[i - 1];
                    array[i - 1] = g;
                }
            }
        }
        return array;
    }
}
