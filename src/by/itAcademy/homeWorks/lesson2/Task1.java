
package by.itAcademy.homeWorks.lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите день: ");
        int day = in.nextInt();
        System.out.println("Введите месяц: ");
        int month = in.nextInt();
        System.out.println("Введите год: ");
        int year = in.nextInt();
        System.out.println(printDay(day, month, year));
        //  Високосныцй для проверки 28, 2, 1600
    }

    public static boolean checkLeapYear(int year) {
        boolean isTrue = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
        if (isTrue == true) {
            return isTrue;
        } else return false;
    }

    public static boolean isLongMonth(int month) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)) {
            return true;
        } else return false;
    }

    public static String printDay(int day, int month, int year) {
        if ((month == 12) && (day == 31)) {
            year++;
            month = 1;
            day = 1;
            return "Будет " + day + "-ое декабря " + year + " года.";
        } else if ((isLongMonth(month) && day == 31)
                || (!isLongMonth(month) && day == 30)
                || (checkLeapYear(year) && day == 29)
                || (!checkLeapYear(year) && day == 28)) {
            day = 1;
            month++;
            return "Будет " + day + "." + month + "." + year + " года.";
        } else {
            day++;
        }
        return "Будет " + day + "." + month + "." + year + " года.";
        //решено
    }
}
