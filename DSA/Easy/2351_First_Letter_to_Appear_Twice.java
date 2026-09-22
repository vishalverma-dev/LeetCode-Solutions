/*
 * Problem: First Letter to Appear Twice
 * LeetCode: 2351
 * Difficulty: Easy
 * Topics: Hash Table, String, Counting
 *
 * Description:
 * Given a lowercase string with a repeated letter, return the first character whose second occurrence is encountered.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public char repeatedCharacter(String s) {

        HashSet<Character> temp = new HashSet<>();

        for(char c: s.toCharArray()){
            if(!temp.add(c)){
                return c;
            }
        }
        return 'a';
        
    }
}
