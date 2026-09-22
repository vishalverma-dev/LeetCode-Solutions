/*
 * Problem: Simplify Path
 * LeetCode: 71
 * Difficulty: Medium
 * Topics: String, Stack
 *
 * Description:
 * Given an absolute Unix-style file path, return its canonical simplified path.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        String[] tokens = path.split("/");

        for(String token: tokens){

            if(token.equals("") || token.equals(".")){
                continue;
            }

            if(token.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(token);
            }

        }

        StringBuilder sb = new StringBuilder();

        for(String dir: st){
            sb.append("/").append(dir);
        }

        return sb.length()==0 ? "/": sb.toString();
        
    }
}
