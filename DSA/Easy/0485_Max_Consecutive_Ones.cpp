/*
 * Problem: Max Consecutive Ones
 * LeetCode: 485
 * Difficulty: Easy
 * Topics: Array
 *
 * Description:
 * Given a binary array, find the maximum number of consecutive 1s.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count = 0;
        int maxCount = 0;
        for(int i:nums){
            if(i==1){
                count++;
                maxCount = max(count, maxCount);
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
};
