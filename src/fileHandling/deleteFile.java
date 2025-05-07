package fileHandling;

import java.io.File;
import java.io.IOException;

public class deleteFile {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\Desktop\\workshop\\src\\fileHandling\\examppleFile.java");
        if (file.delete()) {
            System.out.println("File Deleted " + file.getName() + "Successfully");
        } else {
            System.out.println("File Not Deleted");
        }

    }
}