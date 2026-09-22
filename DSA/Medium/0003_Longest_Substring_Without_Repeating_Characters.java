/*
 * Problem: Longest Substring Without Repeating Characters
 * LeetCode: 3
 * Difficulty: Medium
 * Topics: Hash Table, String, Sliding Window
 *
 * Description:
 * Given a string, return the length of its longest substring with no repeated characters.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(min(n, character set size))
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hs = new HashSet<>();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        
        while(r<s.length()){
            if(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }else{
                hs.add(s.charAt(r));
                r++;
            }

            maxLen = Math.max(maxLen, r-l);
        }

        return maxLen;

    }
}
