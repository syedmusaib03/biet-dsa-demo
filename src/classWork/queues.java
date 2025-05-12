package classWork;

import java.util.LinkedList;
import java.util.Queue;

public class queues {
    public static void main(String[] args) {
        Queue<Integer>  q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q.poll());
        for(int num : q) {
            System.out.println(num);
        }
    }
}
