/*
 * Problem: Longest Palindromic Substring
 * LeetCode: 5
 * Difficulty: Medium
 * Topics: String, Dynamic Programming
 *
 * Description:
 * Given a string, return one of its longest palindromic substrings.
 *
 * Time Complexity: O(n^3)
 * Space Complexity: O(n)
 */
class Solution {

    public static boolean isPalindrome(String s){

        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;


    }

    public String longestPalindrome(String s) {

        int maxLen = 0;
        String maxPal = "";

        for(int i=0; i<s.length(); i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i; j<s.length(); j++){

                sb.append(s.charAt(j));
                if(isPalindrome(sb.toString())){
                    if(sb.length()>maxLen){
                        maxLen = sb.length();
                        maxPal = new String(sb);
                    }
                }

            }
        }

        return maxPal;
        
    }
}
