package Algorithms.Sorting;

import java.util.Arrays;

public class countSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 0) {
            return;
        }

        int max = arr[0];
        for (int num : arr) {
            if (arr[num] > max) {
                max = arr[num];

            }
        }

            int[] countArray = new int[max + 1];
            for (int nums : arr) {
                countArray[nums]++;
            }

            int index = 0;
            for (int i = 0; i <= max; i++) {
                while (countArray[i] > 0) {
                    arr[index] = i;
                    index++;
                    countArray[i]--;
                }


        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 5, 7, 8, 8, 4, 5, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
