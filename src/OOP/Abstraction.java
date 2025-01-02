package OOP;

abstract class Family{

    void example(){
        System.out.println("This is a family");
    }
}

class Test extends Family{

}

public class Abstraction {
    public static void main(String[] args) {
        Test t = new Test();
        t.example();
    }
}
