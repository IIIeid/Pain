package Lr1;

//здание 4

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name of month: ");
        String month = in.nextLine();

        System.out.println("Days in a month: ");
        int day = in.nextInt();

        System.out.println("В месяце " +month +" дней: " + day );
        in.close();
    }
}
