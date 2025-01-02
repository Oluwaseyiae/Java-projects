package conditionalStatements;

import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Choose a color (Red, green, yellow): ");
        String color = in.nextLine().toLowerCase();
        if (color.equals("red")) {
            System.out.println("Stop right there");
        }
        else if (color.equals("green")) {
            System.out.println("You can go");
        }
        else if (color.equals("yellow")) {
            System.out.println("Get ready");
        }
        else {
            System.out.println("Unknown color");
        }
    }
}
