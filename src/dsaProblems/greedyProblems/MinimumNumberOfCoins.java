package dsaProblems.greedyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumberOfCoins {

    static void minimumCoins(List<Integer> coins, int v) {
        List<Integer> result = new ArrayList<>();
        //if the array or list is not sorted,sort it first
        // Traverse the sorted array from end to beginning

        for (int i = coins.size() - 1; i >= 0; i--) {
            while (v >= coins.get(i)) {
                v -= coins.get(i);
                result.add(coins.get(i));
            }
        }
        System.out.println("Coins Selected : ->");
        for (int coin : result) {
            System.out.println(coin + " ");
        }
        System.out.println();
        System.out.println("Minimum number of coins : - >" + result.size());
    }

    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200, 500, 1000);
        int v = 91;
        minimumCoins(coins, v);
        int collection = 40;
        minimumCoins(coins, collection);
    }
}
