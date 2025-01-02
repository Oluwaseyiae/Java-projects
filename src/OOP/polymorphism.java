package OOP;

class vehicle{

    void name(){
        System.out.println("I'm have a name");
    }
}

class Geep extends vehicle{
    @Override
            void name(){
        System.out.println("My name is Geep");
    }
}

class Corola extends vehicle{
    @Override
    void name(){
        System.out.println("My name is Corola");
    }
}

class Toyota extends vehicle{

}


public class polymorphism {
    public static void main(String[] args) {

        vehicle v;

        v = new Geep();
        v.name();

        v = new Corola();
        v.name();

        v = new Toyota();
        v.name();


    }
}
