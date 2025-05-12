package dsaProblems;

public class FindTheWinneroftheCircularGame1823 {
    public static void main(String[] args) {
    }

    int solve(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (solve(n - 1, k) + k) % n;
    }

}
