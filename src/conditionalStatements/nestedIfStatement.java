package conditionalStatements;

import java.util.Scanner;

public class nestedIfStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int largestNumber;

        if (num1>num2){
            if (num1>num3){
                largestNumber = num1;
            } else {
                largestNumber = num3;
            }
        } else {
            if (num2>num3){
                largestNumber = num2;
            } else {
                largestNumber = num3;
            }
        }

        System.out.println("\nThe largest number is " + largestNumber);
    }
}
