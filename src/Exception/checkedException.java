package Exception;

import java.io.IOException;

public class checkedException {
    public static void main(String[] args) throws IOException {
        try{
            throw new IOException();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
