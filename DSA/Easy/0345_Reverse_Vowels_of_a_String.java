/*
 * Problem: Reverse Vowels of a String
 * LeetCode: 345
 * Difficulty: Easy
 * Topics: Two Pointers, String
 *
 * Description:
 * Given a string, reverse only its vowels and keep all other characters in their original positions.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {

    public static boolean isVowel(char ch){

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
            || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
        ) return true;

        return false;

    }

    public String reverseVowels(String s) {

        char[] temp = s.toCharArray();

        int left = 0;
        int right = temp.length-1;

        while(left<right){

            while(left<right && !isVowel(temp[left])) left++;
            while(left<right && !isVowel(temp[right])) right--;

            char sw = temp[left];
            temp[left] = temp[right];
            temp[right] = sw;

            left++;
            right--;

        }

        return new String(temp);


    }
}
