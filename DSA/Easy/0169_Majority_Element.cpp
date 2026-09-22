/*
 * Problem: Majority Element
 * LeetCode: 169
 * Difficulty: Easy
 * Topics: Array, Hash Table, Divide and Conquer, Sorting, Counting
 *
 * Description:
 * Given an array with a majority element occurring more than n / 2 times, return that element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int count = 0;
        int candidate = 0;
        for(int i:nums){
            if(count == 0){
                candidate = i;
            }
            count += (i==candidate) ? 1: -1;
        }
        return candidate;
    }
};
