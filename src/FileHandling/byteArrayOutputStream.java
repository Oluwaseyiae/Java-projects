package FileHandling;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class byteArrayOutputStream {
    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream ba = new ByteArrayOutputStream();

        while(ba.size() != 10){
            ba.write("hello".getBytes());
        }

        byte[] b = ba.toByteArray();
        System.out.println("Print the content");

        for(int i=0; i<b.length; i++){
            System.out.println((char)b[i]);
        }

        int c;

        ByteArrayInputStream bi = new ByteArrayInputStream(b);
        for(int i=0; i<1; i++){
            while((c=bi.read())!=-1){
                System.out.println((char)c);
            }
        }
    }
}
