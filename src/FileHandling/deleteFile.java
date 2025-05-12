package FileHandling;

import java.io.File;
import java.io.IOException;

public class deleteFile {

    public static void main(String[] args) throws IOException {
        File file = new File("./src/FileHandling/example.txt");
        if (file.delete()) {
            System.out.println("File Deleted " + file.getName() + "Successfully");
        } else {
            System.out.println("File Not Deleted");
        }

    }
}