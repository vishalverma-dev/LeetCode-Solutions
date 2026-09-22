/*
 * Problem: Rotate String
 * LeetCode: 796
 * Difficulty: Easy
 * Topics: String, String Matching
 *
 * Description:
 * Given two strings, determine whether one can become the other through repeated left rotations.
 *
 * Time Complexity: O(n^2) worst case
 * Space Complexity: O(n)
 */
class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length()) return false;
        
        String temp = s+s;
        if(temp.contains(goal)) return true;

        return false;
    }
}
