/*
 * Problem: Reverse Only Letters
 * LeetCode: 917
 * Difficulty: Easy
 * Topics: Two Pointers, String
 *
 * Description:
 * Given a string, reverse only its letters while leaving non-letter characters in place.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public String reverseOnlyLetters(String s) {

        char[] charArr = s.toCharArray();

        int left = 0, right = s.length()-1;

        while(left<right){
            if(!Character.isLetter(charArr[left])){
                left++;
            }

            else if(!Character.isLetter(charArr[right])){
                right--;
            }

            else{
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(charArr);
        
    }
}
