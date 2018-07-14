package by.itAcademy.homeWorks.lesson3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Введите количство дней - ");
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int sumP = 0;
        int maxP = 0;
        for (int i = 1; i <= days; i++) {
            System.out.println("Введите величину осадков в день - ");
            int amountDay = in.nextInt();
            if (amountDay > maxP) {
                maxP = amountDay;
            }
            sumP = sumP + amountDay;
        }
        System.out.println("Количество дней: - " + days);
        System.out.println("Сумма осадков за этот период: - " + sumP);
        System.out.println("Среднее количество осадков за этот период: - " + sumP / days);
        System.out.println("Максимальное количество осадков за этот период: - " + maxP);
        //решено
    }

}
