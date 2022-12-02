package Lr1;
//1 задание
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input firstname: ");
        String firstname = in.nextLine();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input patronymic: ");
        String patronymic = in.nextLine();

        System.out.println("Hello: "+firstname  +name +patronymic);
        //проблема с промежутками между словами
        System.out.println("firstname: " + firstname);
        System.out.println("name: " + name);
        System.out.println("patronymic: " + patronymic);
        in.close();
    }
}
