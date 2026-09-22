/*
 * Problem: Two Sum
 * LeetCode: 1
 * Difficulty: Easy
 * Topics: Array, Hash Table
 *
 * Description:
 * Given an integer array and a target, return the indices of two distinct elements whose sum equals the target.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> comp;
        for(int i=0; i<nums.size(); i++){
            int complement = target - nums[i];
            if(comp.find(complement)!=comp.end()){
                return {comp[complement], i};
            }
            comp[nums[i]] = i;
        }
        return {};
    }
};
