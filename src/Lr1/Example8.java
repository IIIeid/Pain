package Lr1;
//задание 3
//
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name of day of the week: ");
        String week = in.nextLine();

        System.out.println("Input name of month: ");
        String month = in.nextLine();

        System.out.println("Day of the month: ");
        int day = in.nextInt();

        System.out.println("Сегодня: " +week +day +month);
        in.close();
    }
}
