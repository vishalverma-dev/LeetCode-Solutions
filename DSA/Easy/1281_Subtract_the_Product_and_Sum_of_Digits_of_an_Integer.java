/*
 * Problem: Subtract the Product and Sum of Digits of an Integer
 * LeetCode: 1281
 * Difficulty: Easy
 * Topics: Math
 *
 * Description:
 * Given an integer, return the product of its digits minus their sum.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum = 0;
        int product = 1;

        while(n>0){

            int digit = n%10;
            sum += digit;
            product *= digit;
            n /= 10;

        }

        return product-sum;

    }
}
