package Lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your year of birth: ");

        int year = in.nextInt();
        int g = 2022;
        int a = g - year;

        System.out.println("Your name: " + name + " Your age: " + a + " years old.");
        in.close();

    }
}
