/*
 * Problem: Best Time to Buy and Sell Stock
 * LeetCode: 121
 * Difficulty: Easy
 * Topics: Array, Dynamic Programming
 *
 * Description:
 * Given daily stock prices, choose at most one buy and one later sell to maximize profit.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int maxDiff = 0;

        for(int i=1; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            maxDiff = Math.max(maxDiff, prices[i]-min);
        }

        return maxDiff;
        
    }
}
