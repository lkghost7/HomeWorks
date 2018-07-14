package by.itAcademy.homeWorks.lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите заначение a: ");
        double a = in.nextDouble();
        System.out.println("Введите отрицательное заначение b: ");
        double b = in.nextDouble();
        System.out.println("Введите заначение c: ");
        double c = in.nextDouble();
        double D = discriminant(a, b, c);
        if (isZero(D)) {
            double x = -b / (2 * a);
            System.out.println("\"Извлекли один корень: " + x);
        } else {
            if (!isPositive(D)) {
                System.out.println("Не смогли извлечь ни одного корня");
            } else {
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Извлекли два корня: " + "\n" + "x1 - " + x1 + "\n" + "x2 - " + x2);
            }
        }
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static boolean isZero(double number) {
        return number == 0;
    }

    public static double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
        //решено
    }
}
