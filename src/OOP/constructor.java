package OOP;

public class constructor {

    private String name;
    private int age;
    private String gender;

//    This is aconstructor
    constructor(){
        name = "Oluwaseyi";
        age = 21;
        gender = "Male";
    }
//      This is a constructor
constructor(String name, int age, String gender){
        name = name;
        age = age;
        gender = gender;
}



    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
    String getGender(){
        return gender;
    }
        public static void main(String[] args) {
        constructor obj1 = new constructor("Oluwaseyi", 21, "Male");
        constructor obj = new constructor();
            System.out.println(obj.getName());
            System.out.println( obj.getAge());
            System.out.println( obj.getGender());
    }
}
