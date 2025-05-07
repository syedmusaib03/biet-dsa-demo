package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//like this we can write try without using catch or finally
public class trycatchInterviewQuestion {

    public static void main(String[] args) throws IOException {

        String str;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            str = br.readLine();
            System.out.println(str);
        }

    }
}

