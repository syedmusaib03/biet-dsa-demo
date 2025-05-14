package Heaps;

class Heap {
    private int[] arr;

    private int size;

    public Heap() {
        arr = new int[101];   //Array to store heap elements
        arr[0] = -1;
        size = 0;

    }

    private void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;


    }

    public void insert(int val) {
        size++;
        arr[size] = val;
        int index = size;
        while (index > 1) {
            int parent = index / 2;
            if (arr[parent] < arr[index]) {
                swap(parent, index);
            } else {
                return;   // The values is at the Correct position
            }
        }
    }

    public void print() {
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void deleteFromHeap() {
        if (size == 0) {
            System.out.println("heap is empty , nothing to add");
            return;
        }
        arr[1] = arr[size];
        size--;
        int i = 1;
        while (i < size) {
            int leftindex = 2 * i;
            int rightindex = 2 * i + 1;
            if (leftindex <= size && arr[i] < arr[leftindex]) {
                swap(i, leftindex);
            } else if (rightindex <= size && arr[i] < arr[rightindex]) {
                swap(i, rightindex);
            } else {
                //otherwise the values is at the correct position
                i = rightindex;
            }
        }
    }
    public static void heapify(int[] arr, int i,int n){
        int largest=i;
        int left=2*i;
        int right=2*i+1;
        if(left <= n && arr[i]<arr[left]){
            largest=left;
        }
        if (right <= n && arr[i]<arr[right]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,largest,n);
        }
    }
}

public class maxHeapAndHeapify {
    public static void main(String[] args) {

        Heap maxheap = new Heap();
        maxheap.insert(20);
        maxheap.insert(30);
        maxheap.insert(50);
        maxheap.insert(10);
        maxheap.insert(40);

        maxheap.print();
        maxheap.deleteFromHeap();
        maxheap.print();

    }
}
