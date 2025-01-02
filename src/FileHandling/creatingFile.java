package FileHandling;

import java.io.File;
import java.io.IOException;

public class creatingFile {
    public static void main(String[] args)  throws IOException {
        File file = new File("C:/Users/user/Documents/Java Programming Course/File handling output/Example.txt");

        file.createNewFile();

        System.out.println(file.getName()); // get file name
        System.out.println(file.getAbsolutePath()); // get file path
        System.out.println(file.exists()); // check if file exist
        System.out.println(file.length()); // check the length of characters in a file
        System.out.println(file.canRead()); // check if the file is readable
        System.out.println(file.canWrite()); // check if a file can be written to
    }
}
