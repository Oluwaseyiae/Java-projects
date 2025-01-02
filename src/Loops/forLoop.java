package Loops;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();

        int spaces = rows - 1;
        int i,j;

        for (j=1; j<=rows; j++) {
            for (i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }
            spaces--;

            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
