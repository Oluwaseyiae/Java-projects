package conditionalStatements;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Choose a color (Red, green, yellow): ");
        String color = in.nextLine().toLowerCase();

        switch (color) {
            case "red":
                System.out.println("Stop right there");
                break;
            case "green":
                System.out.println("You can go");
                break;
            case "yellow":
                System.out.println("Get ready");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }
    }
}
