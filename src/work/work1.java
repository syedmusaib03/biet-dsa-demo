package work;

import java.io.*;
import java.nio.Buffer;

public class work1 {
    public static void main(String[] args) throws IOException {

        String filepath = "./src/work/example.txt";
        try(BufferedWriter reader = new BufferedWriter(new FileWriter(filepath,true))){
        reader.newLine();
         reader.append("Syed Armaan");

          reader.append("Syed Musaib");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}