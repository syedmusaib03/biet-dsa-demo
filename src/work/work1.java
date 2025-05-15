package work;

import java.util.LinkedList;
import java.util.Queue;


class BinaryNumbers {
    public static void Binary(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 1; i <= n; i++) {
            String curr = queue.poll();

        }
    }

    public static void main(String[] args) {

        Binary(3);
        int a = 5;
        System.out.println(Integer.toBinaryString(a));
    }
}

