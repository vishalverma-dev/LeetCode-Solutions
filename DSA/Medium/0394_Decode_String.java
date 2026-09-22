/*
 * Problem: Decode String
 * LeetCode: 394
 * Difficulty: Medium
 * Topics: String, Stack, Recursion
 *
 * Description:
 * Given an encoded string using k[encoded_string], return its decoded form.
 *
 * Time Complexity: O(L)
 * Space Complexity: O(L)
 */
class Solution {
    public String decodeString(String s) {

        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int cnum = 0;

        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                cnum = cnum*10+(c-'0');
            }

            else if(c=='['){
                numStack.push(cnum);
                strStack.push(curr.toString());
                cnum = 0;
                curr = new StringBuilder();
            }

            else if(c==']'){
                int rep = numStack.pop();
                String previous = strStack.pop();
                StringBuilder temp = new StringBuilder(previous);
                for(int i=0; i<rep; i++){
                    temp.append(curr);
                }

                curr = temp;
            }

            else{
                curr.append(c);
            }
        }

        return curr.toString();
        
    }
}
