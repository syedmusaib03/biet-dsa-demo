package exceptionHandling;
// Q. Can we write try blovk without catch or finally block
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
Try-with-resources  ensures automatic closing of resources
(like files, streams, sockets) that implement the AutoCloseable interface.

The resources declared in the parentheses () of a try block must be objects
 of classes that implement the AutoCloseable interface (or Closeable, which
 extends it).
 */

//whatever the object is created within parenthesis of try block it will be closed
public class TryWithResourceInterviewQuestion {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("./src/exceptionHandling/fileReader.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

