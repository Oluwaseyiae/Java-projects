package Methods;

import java.util.Scanner;

public class function {
//    Creating a function
    public static void greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();


        System.out.println("Hello, " +name +"!");
    }

//    Creating a function
    public static int calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        return num1+num2;

    }
    public static void main(String[] args) {
        greeting();
        System.out.println("The addition is " + calculate());
    }
}
