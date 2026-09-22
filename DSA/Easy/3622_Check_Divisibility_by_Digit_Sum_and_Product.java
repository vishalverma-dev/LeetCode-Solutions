/*
 * Problem: Check Divisibility by Digit Sum and Product
 * LeetCode: 3622
 * Difficulty: Easy
 * Topics: Math
 *
 * Description:
 * Given a positive integer n, determine whether it is divisible by the sum of its digits plus their product.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class Solution {
    public boolean checkDivisibility(int n) {

        int og = n;
        int sum = 0;
        int product = 1;

        while(n>0){
            int digit = n%10;
            sum += digit;
            product *= digit;
            n /= 10;
        }


        return (og % (sum+product) == 0);
    }
}
