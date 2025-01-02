package Basics;

// import Scanner
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

//        Create an object of scanner
        Scanner sc = new Scanner(System.in);

//        Reading an integer
        System.out.print("How old are you? ");
        int age = sc.nextInt();
        System.out.println("I am " + age + " years old");

//        Reading a string
        System.out.print("What is your name? ");
        String name = sc.next();
        System.out.println("My name is " + name);

        System.out.println("My name is " + name +"and I am " + age + " years old.");

    }
}
