/*
 * Problem: Container With Most Water
 * LeetCode: 11
 * Difficulty: Medium
 * Topics: Array, Two Pointers, Greedy
 *
 * Description:
 * Given vertical line heights, choose two lines that form a container holding the maximum amount of water.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;
        int a = 0;

        while(left<right){

            int l = Math.min(height[left], height[right]);
            int cal = l*(right-left);
            a = Math.max(a, cal);

            if(height[left]<height[right]) left++;
            else right--;

        }

        return a;
        
    }
}
