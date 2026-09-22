/*
 * Problem: Remove All Adjacent Duplicates In String
 * LeetCode: 1047
 * Difficulty: Easy
 * Topics: String, Stack
 *
 * Description:
 * Given a string, repeatedly remove adjacent equal letters until no such pair remains.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray()){
            if(!st.isEmpty() && st.peek()==c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }

        StringBuilder res = new StringBuilder();

        while(!st.isEmpty()){
            res.append(st.pop());
        }

        res.reverse();
        return res.toString();
        
    }
}
