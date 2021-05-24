package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Main {
private static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
        "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
        "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) { guess (); }

    private static void guess (){
        Scanner sc = new Scanner(System.in);
        String x = null;
        int num = 1;
        while (num != 0 ) {
            Random rand = new Random();
            int n = rand.nextInt(words.length);
            String hiddenWord = words[n];
            System.out.println("Загадано слово, попробуйте его угадать");
            System.out.println("Список возможных вариантов:");
            for (int i = 0; i < words.length; i++) {
                System.out.print(words[i] + " ");
                if (i !=0 && i % 6 == 0)
                    System.out.println();
            }

            while(true) {
                x = sc.nextLine();
                if (!hiddenWord.equals(x)) {
                    System.out.println("Вы не угадали");
                    System.out.print("Буквы в слове, которые стоят на своих местах: ");
                    int strSize = 0;
                    if (hiddenWord.length() < x.length())
                        strSize = hiddenWord.length();
                    else strSize = x.length();
                    for (int i = 0; i < strSize; i++) {
                        char a = hiddenWord.charAt(i);
                        char b = x.charAt(i);
                        if (a == b)
                            System.out.print(a);
                        else
                            System.out.print("#");
                    }
                    System.out.print("############### \n");
                    System.out.println("Попробуйте снова");
                    System.out.println("Список возможных вариантов:");
                    for (int i = 0; i < words.length; i++) {
                        System.out.print(words[i] + " ");
                        if (i !=0 && i % 6 == 0)
                            System.out.println();
                    }
                }
                else break;
            }
            System.out.println("Поздравляем! Вы угадали! Загаданное слово - \'" + hiddenWord + "\'");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            num = sc.nextInt();
        }
        sc.close();
    }
}
