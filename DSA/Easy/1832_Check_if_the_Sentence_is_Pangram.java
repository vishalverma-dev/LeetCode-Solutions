/*
 * Problem: Check if the Sentence Is Pangram
 * LeetCode: 1832
 * Difficulty: Easy
 * Topics: Hash Table, String, Bit Manipulation
 *
 * Description:
 * Given a lowercase English sentence, determine whether it contains every letter of the alphabet.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] letters = new boolean[26];

        for(char c: sentence.toCharArray()){

            letters[c-'a'] = true;
            
        }

        for(boolean an: letters){

            if(!an) return false;
            
        }

        return true;
        
    }
}
