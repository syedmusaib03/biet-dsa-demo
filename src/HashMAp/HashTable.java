package HashMAp;
import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<>();
        table.put(101,"Syed Musaib");
        table.put(102,"Vignesh Bhatt");
        table.put(103,"Praffull Kumar");

        for(Map.Entry kv : table.entrySet()) {
            System.out.println(kv.getKey() +"->"+ kv.getValue() );
        }

    }
}
