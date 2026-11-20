/*
 * Problem: 4Sum II
 * LeetCode: 454
 * Difficulty: Medium
 * Topics: Array, Hash Table
 *
 * Description:
 * Given four integer arrays, return the number of tuples (i, j, k, l) such that
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0.
 *
 * Approach:
 * Use a HashMap to store the frequency of all possible pair sums
 * from nums1 and nums2. Then, iterate through nums3 and nums4,
 * calculate the negated pair sum, and add its frequency from the HashMap
 * to the total count.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2)
 */


class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a: nums1){
            for(int b: nums2){
                int sum = a+b;
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
        }

        int count = 0;
        for(int c: nums3){
            for(int d: nums4){
                int sum = c+d;
                int tar=-sum;
                count+=map.getOrDefault(tar,0);
            }
        }

        return count;


        
    }
}