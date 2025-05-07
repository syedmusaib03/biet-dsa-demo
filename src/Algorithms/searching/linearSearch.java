package Algorithms.searching;

public class linearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {14, 3, 1, 5, 4, 2, 9, 0};
        System.out.println(search(arr, 4));
    }
}
