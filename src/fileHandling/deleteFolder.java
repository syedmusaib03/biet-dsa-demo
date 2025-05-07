package fileHandling;

import java.io.File;

public class deleteFolder {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\User\\Desktop\\workshop\\src\\fileHandling\\test");
        if(folder.delete()){
            System.out.println("Folder Deleted " +folder.getName());
        }
        else{
            System.out.println("Not Deleted");
        }
    }
}
