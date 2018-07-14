package by.itAcademy.homeWorks.lesson3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для фибоначи: - ");
        int numberF = in.nextInt();
        System.out.print("Введите число для рекурсии: - ");
        int numberR = in.nextInt();
        System.out.println("-= числа фибоначи =-");
        for (int i = 1; fibonachy(i) < numberF; i++) {
            System.out.print(" | " + fibonachy(i));
        }
        System.out.println("\n" + "-= числа рекурсии =-");
        for (int i = 1; recursion(i) < numberR; i++) {
            System.out.print(" | " + recursion(i));
        }
    }

    public static int fibonachy(int numberF) {
        if (numberF == 1 || numberF == 2) {
            return 1;
        } else {
            return (fibonachy(numberF - 1) + fibonachy(numberF - 2));
        }
    }

    static int recursion(int numberR) {
        if (numberR == 0) {
            return 0;
        }
        if (numberR == 1) {
            return 1;
        } else {
            return recursion(numberR - 1) + recursion(numberR - 2);
            //решено
        }
    }
}






