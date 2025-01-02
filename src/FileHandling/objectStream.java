package FileHandling;


import java.io.*;

class  House implements Serializable {
    public String name;
    public String address;
}

public class objectStream {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("C:/Users/user/Documents/Java Programming Course/File handling output/Example.txt"));
        House house = new House();

        house.name = "John Doe";
       house.address = "123 Main St.";
        obj.writeObject(house);
        obj.close();


        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("C:/Users/user/Documents/Java Programming Course/File handling output/Example.txt"));
        House h = (House) obj1.readObject();
        obj1.close();

        System.out.println(h.name);
        System.out.println(h.address);
    }
}
