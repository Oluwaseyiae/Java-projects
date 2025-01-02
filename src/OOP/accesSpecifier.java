package OOP;

class  Example{
    private void fun(){
        System.out.println("Hello World");
    }
    public void testing(){
        System.out.println("I'm an example");
    }
}


public class accesSpecifier {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.testing();
    }
}
