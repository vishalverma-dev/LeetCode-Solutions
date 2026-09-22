/*
 * Problem: Best Time to Buy and Sell Stock II
 * LeetCode: 122
 * Difficulty: Medium
 * Topics: Array, Dynamic Programming, Greedy
 *
 * Description:
 * Given daily stock prices, maximize profit with any number of non-overlapping transactions.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int maxProfit(int[] prices) {

        int sum = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                sum += prices[i]-prices[i-1];
            }
        }

        return sum;
    }
}
