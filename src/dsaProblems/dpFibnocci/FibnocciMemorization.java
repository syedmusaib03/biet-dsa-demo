package dsaProblems.dpFibnocci;

import java.util.Arrays;

public class FibnocciMemorization {
    public static int fib(int n, int[] dp) {
        if (n <= 1) {
            if (dp[n] != -1) return dp[n];
        }

        return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);


    }

    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Fibnocci  umbenumber" + n + "is" + fib(n, dp));
    }
}
