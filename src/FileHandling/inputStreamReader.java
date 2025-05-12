package FileHandling;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;


//we are taking the data in byte stream and putting in character stream
public class inputStreamReader {
    public static void main(String[] args) {
       try{
           InputStreamReader isr = new InputStreamReader(System.in);
           int letters = isr.read();
           while(isr.ready()){
               System.out.println((char) letters);
               letters = isr.read();
           }
           isr.close();
           System.out.println();
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }

    }
}
