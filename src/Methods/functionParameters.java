package Methods;

import java.util.Scanner;
public class functionParameters {

//  Creating a function
    public static int numberChecker(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return num1;
        } else if(num2 > num1 && num2 > num3){
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        System.out.println("\nThe greatest number is " + numberChecker(num1, num2, num3));

    }
}
