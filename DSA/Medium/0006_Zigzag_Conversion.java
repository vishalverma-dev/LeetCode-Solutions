/*
 * Problem: Zigzag Conversion
 * LeetCode: 6
 * Difficulty: Medium
 * Topics: String
 *
 * Description:
 * Given a string and a row count, write the characters in a zigzag pattern and return the row-wise reading.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public String convert(String s, int numRows) {

        if(numRows==1 || numRows>s.length()) return s;

        StringBuilder[] arr = new StringBuilder[numRows];

        for(int i=0; i<numRows; i++){

            arr[i] = new StringBuilder();

        }

        int dir = 1;
        int c = 0;

        for(int i=0; i<s.length(); i++){

            arr[c].append(s.charAt(i));

            if(c==numRows-1) dir = -1;
            else if(c==0) dir = 1;

            c += dir;

        }

        StringBuilder res = new StringBuilder();

        for(int i=0; i<numRows; i++){
            res.append(arr[i]);
        }

        return res.toString();
        
    }
}
