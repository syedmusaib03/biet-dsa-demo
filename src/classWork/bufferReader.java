package classWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//instead of using scanner class to take input we can use buffer reader
//to take the input
public class bufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        String str;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            br.close();
        }

    }
}
