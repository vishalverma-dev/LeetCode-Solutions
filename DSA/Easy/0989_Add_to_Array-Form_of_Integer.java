/*
 * Problem: Add to Array-Form of Integer
 * LeetCode: 989
 * Difficulty: Easy
 * Topics: Array, Math
 *
 * Description:
 * Given a non-negative integer as digits and an integer k, return the digit array representing their sum.
 *
 * Time Complexity: O(max(n, log k))
 * Space Complexity: O(max(n, log k))
 */
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> res = new ArrayList<>();
        for(int i=num.length-1; i>=0 || k>0; i--){
            if(i>=0){
                k += num[i];
            }

            res.add(k%10);
            k /= 10;
        }

        Collections.reverse(res);

        return res;
        
    }
}
