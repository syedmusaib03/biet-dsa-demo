package dsaProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Arrays;

public class KthLArgestElementInAnArrayMaxHeap {
    public static void kthdmsmmalestElement(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        System.out.println("kth min element:  ");
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll()+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println(Arrays.toString(arr));
        int k = 3;
       kthdmsmmalestElement(arr,k);

    }
}
