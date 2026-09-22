/*
 * Problem: Count Elements With Maximum Frequency
 * LeetCode: 3005
 * Difficulty: Easy
 * Topics: Array, Hash Table, Counting
 *
 * Description:
 * Given an integer array, return the total occurrences of every value tied for the highest frequency.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        unordered_map<int, int> frequency;

        for(int i:nums){
            frequency[i]++;
        }

        int maxFrequency = 0;
        for(auto i:frequency){
            maxFrequency = max(i.second, maxFrequency);
        }

        int count = 0;
        for(auto i:frequency){
            if(i.second==maxFrequency){
                count += i.second;
            }
        }
        
        return count;
    }
};
