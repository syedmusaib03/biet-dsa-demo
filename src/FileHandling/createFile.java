package FileHandling;

import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) throws IOException {
        //This type of file path is called Absolute file path
        File file = new File("C:\\Users\\User\\Desktop\\workshop\\src\\fileHandling\\examppleFile.java");
        if(file.createNewFile()){
            System.out.println("File Created "+file.getName() +"Successfully");
        }else{
            System.out.println("File Not Created");
        }

    }
}
