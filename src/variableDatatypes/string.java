package variableDatatypes;

public class string {
    public static void main(String[] args) {

        String name = "Abiola John Oluwaseyi";
        String Occupation = "Artificial Intelligence Engineer";

        System.out.println("My name is " + name + ".\nI am an " + Occupation);

//        // String Methods
        System.out.println(name.contains(Occupation));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(12));
    }
}
