package OOP;

class Shoe {
    String name;
    int size;
    String color;


    Shoe (String name, int size, String color) {
        name = name;
        size = size;
        color = color;
    }

    void getName() {
        System.out.println("The name is " +name);
    }
    void getSize() {
        System.out.println("The size is " +size);
    }
    void getColor() {
        System.out.println("The color is " +color);
    }
}

class Palm extends Shoe {

    Palm(){
        super("Timber Land", 45, "Black");
    }

}

public class inheritance {
    public static void main(String[] args) {
        Palm s = new Palm();
        s.getName();
        s.getSize();
        s.getColor();
    }
}
