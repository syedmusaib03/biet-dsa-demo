package Iterators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class arraylist {
    public static void main(String[] args) {

        /*
        1.if we want to modify collections(arraylist,hashmap)
        we have to use iterator instead of loops

        2.if we want to use loop only to modify it will throw
        CurrentModificationsException To avoid this we have to use
        (CopyOnWriteArrayList) like this
        ArrayList<Integer> list = new CopyOnWriteArrayList<>();

      */  List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next() % 2== 0) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}