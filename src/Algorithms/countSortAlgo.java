package Algorithms;

//Single  Digit Nuber
//Whole Has (0-9)
//Non -Comparison Algo


import java.util.Arrays;

/*steps for algo
1.Find the max
2.count array
3.calculate the frequency
4.calculate the cummlative count of the array
5.create the output array
6.start from the end (R+L)
 */
public class countSortAlgo {
    public static void cycleSort(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] = count[i] + count[i - 1];
        }
        int[] out = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            out[--count[arr[i]]] = arr[i];
        }
        System.arraycopy(out, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 1, 4, 3, 2, 3, 1};

        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
