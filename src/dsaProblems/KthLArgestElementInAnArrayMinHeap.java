package dsaProblems;

import java.util.PriorityQueue;

public class KthLArgestElementInAnArrayMinHeap {
    public static void kthlargestElement(int[] arr, int k) {
        //priority queue is default min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        System.out.println("The " + k + " min Element are ");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 40, 5};
kthlargestElement(arr,2);
    }
}
