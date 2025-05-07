package fileHandling;

import java.io.File;

public class createFolder {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\User\\Desktop\\workshop\\src\\fileHandling\\test");
        if (folder.mkdir()) {
            System.out.println("Folder " + folder.getName() + " created ");
        } else {
            System.out.println("Folder Already Exists");
        }
    }
}
