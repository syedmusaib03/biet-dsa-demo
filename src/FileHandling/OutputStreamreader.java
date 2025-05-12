package FileHandling;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamreader {
    public static void main(String[] args) throws IOException {
      try(  OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
          osw.write("Hello world");
          System.out.println();
          osw.write(97);
          System.out.println();
          osw.write('d');
          char[] arr = "hello".toCharArray();
          osw.write(arr);
      }catch (Exception e) {
          System.out.println(e.getMessage());
      }
    }
}
