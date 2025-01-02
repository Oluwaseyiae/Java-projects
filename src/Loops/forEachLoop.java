package Loops;

public class forEachLoop {
    public static void main(String[] args) {
        String name = "Oluwaseyi";

        for(String a: name.split(" ")) {
            System.out.println(a);
        }
    }
}
