package Lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int x = in.nextInt();

        int y = x-1;
        int z = x+1;
        int c = x+z+y;
        int v =c*c;
        System.out.println(" "+x +" " +y +" " +z +" "+v );
    }
}
