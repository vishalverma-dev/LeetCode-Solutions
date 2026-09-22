/*
 * Problem: Maximum Number of Vowels in a Substring of Given Length
 * LeetCode: 1456
 * Difficulty: Medium
 * Topics: String, Sliding Window
 *
 * Description:
 * Given a string and k, return the greatest number of vowels in any substring of length k.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {

    public static boolean isVowel(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }

    public int maxVowels(String s, int k) {
        int vowelCount = 0;
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
        }

        int maxVowelCount = vowelCount;
        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i-k))){
                vowelCount--;
            }
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }

            maxVowelCount = Math.max(maxVowelCount, vowelCount);

        }

        return maxVowelCount;
    }
}
