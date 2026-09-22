/*
 * Problem: Detect Capital
 * LeetCode: 520
 * Difficulty: Easy
 * Topics: String
 *
 * Description:
 * Given a word, determine whether its capitalization follows one of the valid capitalization patterns.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public boolean detectCapitalUse(String word) {

        int upperCount = 0;

        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                upperCount++;
            }
        }


        if((upperCount==word.length())
          || (upperCount==0)
          || (upperCount==1 && Character.isUpperCase(word.charAt(0)))) return true;

        return false;
    }
}
