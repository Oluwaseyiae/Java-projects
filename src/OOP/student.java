package OOP;

import java.util.Scanner;

public class student{
    String name;
    int age;
    String gender;

    void studentName(){
        System.out.println("\nMy name is "+name);
    }

    void studentAge(){

        System.out.println("I am "+age +" years old.");
    }

    void studentGender(){
        System.out.println("I am "+gender);
    }


    public static void main(String[] args) {

        student s1 = new student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter your age: ");
        s1.age = sc.nextInt();

        System.out.print("Enter your gender: ");
        s1.gender = sc.nextLine();


        s1.studentName();
        s1.studentAge();
        s1.studentGender();

    }
}
