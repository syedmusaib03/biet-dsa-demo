package Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveItemsUsingIterator {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);

        Iterator<Integer> it = num.iterator();

        num.forEach(System.out::println);
        num.removeIf(n-> n > 20); // removes element greater than 20
        System.out.println("After " + num);


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator<Integer> iter = list.iterator();

        while(it.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
