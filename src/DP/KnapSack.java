package DP;

import java.util.Arrays;

public class KnapSack {
    public static int knapsack(int weights[], int values[], int target) {
        // make a dp array and fill the array with -1 making sure to set weight 0 to value 0
        int [] dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        // loop through every object which is simply length of weights array, values array also works as they should be same length
        for (int i = 0; i < weights.length; i++) {
            // as discussed make sure to loop from highest value backwards to avoid reusing the same object
            for (int j = target; j >= weights[i]; j--) {
                // if we establish a particular weight is achievable we update out current weight maximum value
                if(dp[j - weights[i]] != -1) {
                    dp[j] = Math.max(dp[j], dp[j - weights[i]] + values[i]);
                }
            }
        }
        return dp[target];
    }

}
