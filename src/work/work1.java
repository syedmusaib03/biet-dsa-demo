package work;

public class work1 {
    public static int sea(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {

                return sea(arr, start = mid + 1, end, 6);

            } else if (target < arr[mid]) {
                return sea(arr, start, end = mid - 1, 6);


            } else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int start = 0 ,end = arr.length-1,target = 6;
        System.out.println(sea(arr,start,end,target ));
    }
}
