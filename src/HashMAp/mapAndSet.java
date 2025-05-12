package HashMAp;

import java.util.*;

public class mapAndSet {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "Hello");
        map.put("2", "Hi");
        map.forEach((key, value) -> System.out.println(key + " = " + value));




        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        //to print  using lambda Expression(v.IMPORTANT)
        set.forEach(System.out::println);




        //WE CAN USE addAll method to add  instead of for loop
        String[] uniqueNames = {"Syed Musaib", "Prafull", "Vinod", "Vignesh", "Prafull", "Vinod"};
        Set<String> s = new LinkedHashSet<>();
        s.addAll(Arrays.asList(uniqueNames));
        s.forEach(System.out::println);
    }
}
