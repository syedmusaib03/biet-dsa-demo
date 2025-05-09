package work;

import java.util.Stack;

public class work1 {
    public static void sort(int[] arr){

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int[] arr = {10, 20, 30, 40, 50};
        for (int num : arr) {
            s.push(num);
        }
        for (int num : arr) {
            System.out.println(s.pop());
        }
        System.out.println(s.isEmpty());
    }
}
