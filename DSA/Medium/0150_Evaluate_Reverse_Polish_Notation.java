/*
 * Problem: Evaluate Reverse Polish Notation
 * LeetCode: 150
 * Difficulty: Medium
 * Topics: Array, Math, Stack
 *
 * Description:
 * Given tokens representing an arithmetic expression in reverse Polish notation, evaluate and return its value.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {

    public static boolean isOperator(String s){

        return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%"));

    }

    public static int operate(String op, int val1, int val2){
        if(op.equals("+")) return val2+val1;
        if(op.equals("-")) return val2-val1;
        if(op.equals("*")) return val2*val1;
        if(op.equals("/")) return val2/val1;
        if(op.equals("%")) return val2%val1;
        return 0;
    }


    public int evalRPN(String[] tokens) {

        Stack<Integer> st  = new Stack<>();
        for(String token: tokens){
            if(isOperator(token)){
                int val1 = st.pop();
                int val2 = st.pop();
                st.push(operate(token, val1, val2));
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
        
    }
}
