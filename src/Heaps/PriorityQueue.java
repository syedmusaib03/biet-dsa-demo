package Heaps;

import java.awt.event.MouseAdapter;
import java.util.Collections;
import java.util.PriorityQueue;

class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        minHeap.add(10);
        minHeap.add(1);
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(11);

        System.out.println("Min Heap :" + minHeap);

        PriorityQueue<Integer> maxHeap = new
                PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(1);
        maxHeap.add(21);
        maxHeap.add(11);
        maxHeap.add(31);
        maxHeap.add(10);
        System.out.println("Max Heap " + maxHeap);
        System.out.println("Largest ELement " +maxHeap.poll());

    }
}
