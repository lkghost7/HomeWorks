package by.itAcademy.homeWorks.lesson3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Сумма числа: - " + number + "\n" + "Ровна - " + numberSum(number));
    }

    public static int numberSum(int number) {
        int numberSum = 0;
        while (number > 0) {
            numberSum = numberSum + number % 10;
            number = number / 10;
        }
        return numberSum;
        //решено
    }
}