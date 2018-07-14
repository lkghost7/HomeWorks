package by.itAcademy.homeWorks.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длинну участка: ");
        int lenghtOfSection = scan.nextInt();
        System.out.print("Введите ширину участка: ");
        int widthOfSection = scan.nextInt();
        System.out.print("Введите длинну первого дома: ");
        int lenghtHouse1 = scan.nextInt();
        System.out.print("Введите ширину первого дома: ");
        int widthHouse1 = scan.nextInt();
        System.out.print("Введите длинну второго дома: ");
        int lenghtHouse2 = scan.nextInt();
        System.out.print("Введите ширину второго дома: ");
        int widthHouse2 = scan.nextInt();

        if ((lenghtHouse1 <= lenghtOfSection)
                && (lenghtHouse2 <= lenghtOfSection)
                && (widthHouse1 + widthHouse2 <= widthOfSection)
                ||
                ((widthHouse1 <= widthOfSection)
                        && (widthHouse2 <= widthOfSection)
                        && (lenghtHouse1 + lenghtHouse2 <= lenghtOfSection))
                ||
                ((lenghtHouse1 <= widthOfSection)
                        && (lenghtHouse2 <= widthOfSection)
                        && (widthHouse1 + widthHouse2 <= lenghtOfSection))
                ||
                ((widthHouse1 <= lenghtOfSection)
                        && (widthHouse2 <= lenghtOfSection)
                        && (lenghtHouse1 + lenghtHouse2 <= widthOfSection))
                ) {
            System.out.println("Два дома поместились на участок");
        } else System.out.println("Два дома не смогли поместится на участок");
        //решено.
    }
}
