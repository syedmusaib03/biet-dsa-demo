package dsaProblems;

public class sqRootBinarySearch {
    public static void main(String[] args) {
        int n=80;
        int s=0;
        int e=(n/2)+1;
        int res=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(((mid*mid))==n) {
                res = mid;
                break;
            }
            else if ((mid*mid)<n) {
                res = mid;
                s = mid + 1;
            }
            else e=mid-1;
        }
        System.out.println(res);

    }
}