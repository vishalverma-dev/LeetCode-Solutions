/*
 * Problem: Sum of Square Numbers
 * LeetCode: 633
 * Difficulty: Medium
 * Topics: Math, Two Pointers, Binary Search
 *
 * Description:
 * Given a non-negative integer c, determine whether it can be written as a² + b².
 *
 * Time Complexity: O(sqrt(c))
 * Space Complexity: O(1)
 */
class Solution {
    public boolean judgeSquareSum(int c) {

        long i = 0;
        long j = (long)Math.sqrt(c);

        while(i<=j){

            long sum = i*i + j*j;

            if(sum==c) return true;
            else if(sum<c) i++;
            else j--;

        }

        return false;
        
    }
}
