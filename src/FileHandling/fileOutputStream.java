package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class fileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        FileChannel fc = null;

        try{
            fos = new FileOutputStream("C:/Users/user/Documents/Java Programming Course/File handling output/Example.txt");
            fos.write('b');

            fos.flush();

            fc = fos.getChannel();

            long pos = fc.position();

            System.out.println(pos);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if(fos != null){
                fos.close();
            }if (fc != null){
                fc.close();
            }
        }
    }
}
