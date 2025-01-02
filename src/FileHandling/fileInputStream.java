package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class fileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileChannel fc = null;
        int i=0;

        try{
            fis = new FileInputStream("C:/Users/user/Documents/Java Programming Course/File handling output/Example.txt");
            while((i = fis.read()) != -1){
                fc = fis.getChannel();
                long pos = fc.position();
                System.out.println("Position " +pos+ ", Character Read: " +(char)i);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if(fis != null){
                fis.close();
            }if (fc != null){
                fc.close();
            }
        }
    }
}
