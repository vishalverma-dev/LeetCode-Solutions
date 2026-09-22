/*
 * Problem: Find First and Last Position of Element in Sorted Array
 * LeetCode: 34
 * Difficulty: Medium
 * Topics: Array, Binary Search
 *
 * Description:
 * Given a sorted array and a target, return the first and last target indices or [-1, -1].
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
int firstOccurence(vector<int>& nums, int target){
    int start=0, end=nums.size()-1;
    int first = -1;
    while(start<=end){
        int mid = start+(end-start)/2;
        if(nums[mid]==target){
            first = mid;
            end = mid-1;
        }
        else if(nums[mid]<target){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
    }
    return first;
};

int lastOccurence(vector<int>& nums, int target){
    int start=0, end=nums.size()-1;
    int last = -1;
    while(start<=end){
        int mid = start+(end-start)/2;
        if(nums[mid]==target){
            last = mid;
            start = mid+1;
        }
        else if(nums[mid]<target){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
    }
    return last;
};

class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int first = firstOccurence(nums, target);
        if(first!=-1){
            int last = lastOccurence(nums, target);
            return {first, last};
        }else{
            return {-1,-1};
        }
    }
};
