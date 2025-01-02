package Loops;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String name = in.nextLine().toLowerCase();

        System.out.print("Enter your Password: ");
        String password = in.nextLine().toLowerCase();



        if (name.contains("oluwaseyiae") && password.contains("2203")){
                System.out.println("Welcome " + name + "!");
                break;
            }
        else {
            System.out.println("Invalid username or password!");

        }
        i++;
        } while(i<=3);


    }
}
