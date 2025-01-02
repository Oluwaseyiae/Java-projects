package Loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            int i = 0;
        while(i<=num) {
            if (i%2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
