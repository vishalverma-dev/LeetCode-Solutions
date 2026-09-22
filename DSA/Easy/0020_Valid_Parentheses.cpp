/*
 * Problem: Valid Parentheses
 * LeetCode: 20
 * Difficulty: Easy
 * Topics: String, Stack
 *
 * Description:
 * Given a string containing bracket characters, determine whether every opening bracket is closed in the correct order.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
public:
    bool isValid(string s) {
        stack<char> brackets;
        for (char ch : s) {
            if (ch == '(' || ch == '{' || ch == '[') {
                brackets.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (brackets.empty()) {
                    return false;
                }
                char top = brackets.top();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
                brackets.pop();
            }
        }
        return brackets.empty();
    }
};
