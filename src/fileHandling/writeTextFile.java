package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writeTextFile {
    public static void main(String[] args)throws IOException {
        //This type of file path is called relative file path
        FileWriter filewrite = new FileWriter("./src/fileHandling/biet.txt",true);
        filewrite.append("\n i have added extra lines through write data into file \n");
        filewrite.close();
        System.out.println("Succesfully wrote lines in biet.txt");
    }
}
