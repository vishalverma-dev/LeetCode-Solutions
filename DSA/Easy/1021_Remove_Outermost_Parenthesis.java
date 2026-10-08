/*
 * Problem: Remove Outermost Parentheses
 * LeetCode: 1021
 * Difficulty: Easy
 * Topics: String, Queue, Parentheses
 *
 * Description:
 * Given a valid parentheses string, remove the outermost parentheses
 * of every primitive valid parentheses string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */


class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for(char c: s.toCharArray()){

            if(c=='('){
                if(depth>0){
                    sb.append(c);
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0){
                    sb.append(c);
                }
            }
        }

        return sb.toString();
        
    }
}