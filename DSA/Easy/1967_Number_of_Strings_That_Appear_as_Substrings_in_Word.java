/*
 * Problem: Number of Strings That Appear as Substrings in Word
 * LeetCode: 1967
 * Difficulty: Easy
 * Topics: Array, String
 *
 * Description:
 * Given patterns and a word, count how many patterns occur as substrings of the word.
 *
 * Time Complexity: O(pwl) worst case
 * Space Complexity: O(1)
 */
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String i: patterns){
            if (word.contains(i)) count++;
        }

        return count;
    }
}
