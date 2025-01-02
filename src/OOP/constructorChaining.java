package OOP;

import org.w3c.dom.ls.LSOutput;

class Animal{
    String name;
    String color;
}

class Dog extends Animal{
    Dog(){
        String name;

        System.out.println("I am Dog");
    }
}

public class constructorChaining {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Dog";
        d.color = "Blue";
        System.out.println("My name is " + d.name);
        System.out.println("My color is " + d.color);

    }
}
