/*
 * Problem: Spiral Matrix
 * LeetCode: 54
 * Difficulty: Medium
 * Topics: Array, Matrix, Simulation
 *
 * Description:
 * Given an m x n matrix, return all elements in spiral order.
 *
 * Time Complexity: O(mn)
 * Space Complexity: O(1)
 */
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> traversal;
        if (matrix.empty() || matrix[0].empty()) return traversal;

        int left = 0, right = matrix[0].size() - 1;
        int top = 0, bottom = matrix.size() - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++)
                traversal.push_back(matrix[top][i]);
            top++;

            for (int i = top; i <= bottom; i++)
                traversal.push_back(matrix[i][right]);
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    traversal.push_back(matrix[bottom][i]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    traversal.push_back(matrix[i][left]);
                left++;
            }
        }
        return traversal;
    }
};
