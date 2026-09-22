/*
 * Problem: Sum of GCD of Formed Pairs
 * LeetCode: 3867
 * Difficulty: Medium
 * Topics: Array, Math, Number Theory, Sorting
 *
 * Description:
 * Given an array, build its prefix-GCD array, pair its sorted smallest and largest remaining values, and return the sum of pair GCDs.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
class Solution {

    public static int gcd(int a, int b){
        while (b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }

    public long gcdSum(int[] nums) {

        int[] prefixGcd = new int[nums.length];
        prefixGcd[0] = nums[0];
        int max = nums[0];

        for(int i=1; i<nums.length; i++){

            if(nums[i]>max){
                max = nums[i];
            }
            prefixGcd[i] = gcd(nums[i], max);

        }

        Arrays.sort(prefixGcd);        

        int left = 0;
        int right = prefixGcd.length-1;

        long sum = 0;

        while(left<right){
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }

        return sum;

    }
}
