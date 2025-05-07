package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/fileHandling/biet.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNext()) {
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }
}
