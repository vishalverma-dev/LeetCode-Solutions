/*
 * Problem: Shuffle String
 * LeetCode: 1528
 * Difficulty: Easy
 * Topics: String
 *
 * Description:
 * Given a string and a permutation of indices, rebuild the string by placing each character at its assigned index.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public String restoreString(String s, int[] indices) {

        char[] res = new char[s.length()];

        for(int i=0; i<indices.length; i++){

            res[indices[i]] = s.charAt(i);

        }

        return new String(res);
        
    }
}
