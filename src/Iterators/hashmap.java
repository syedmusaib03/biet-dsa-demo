package Iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Syed Musaib");
        map.put(2, "Nida Mehek");
        map.put(3, "Syed Armaan");


        Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();

        while(it.hasNext()){
            if(it.next().getKey().equals(1)){
                it.remove();

            }
        }
        System.out.println(map);

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry);
        }

    }
}
