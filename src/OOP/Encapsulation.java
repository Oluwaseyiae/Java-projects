package OOP;

class Student{
    private String name;
    private int age;
    private double cgpa;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getCgpa(){
        return cgpa;
    }


}

public class Encapsulation {
}
