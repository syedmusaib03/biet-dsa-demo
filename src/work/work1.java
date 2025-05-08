package work;


class CountSort {

    public static int  sort() {
        int n = 40;
        int start = 0;
        int end = n/2+1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sq = mid * mid;
            if (sq == n) {
                res = mid;
                break;
            } else if (sq < n) {
                res = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(sort());

    }
}
