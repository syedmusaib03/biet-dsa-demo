package work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class ll {

}

public class work3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(24);
        list.add(34);
        list.add(56);
        list.getFirst();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
      //  Iterator<> it = new Iterator<>() {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(23);
        num.add(34);
        num.add(56);
        Iterator<Integer> it= num.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }

        }
    }
}
