package conditionalStatements;

import java.util.Scanner;

public class ifElseStatemetnt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = in.nextInt();
        if (age >= 18) {
            System.out.println("You are older than 18.");
        } else {
            System.out.println("You are not up to 18.");
        }
    }
}
