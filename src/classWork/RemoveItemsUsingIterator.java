package classWork;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveItemsUsingIterator {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);

        Iterator<Integer> it = num.iterator();

        num.removeIf(n -> n > 10);
        System.out.println("After " + num);

    }
}
