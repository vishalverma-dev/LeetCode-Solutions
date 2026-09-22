/*
 * Problem: Spiral Matrix II
 * LeetCode: 59
 * Difficulty: Medium
 * Topics: Array, Matrix, Simulation
 *
 * Description:
 * Given n, generate an n x n matrix filled from 1 through n² in spiral order.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2)
 */
class Solution {
    public int[][] generateMatrix(int n) {

        if(n==0) return new int[0][0];

        int[][] matrix = new int[n][n];

        int left = 0, right = n-1;
        int top = 0, bottom = n-1;

        int c=1;

        while(left<=right && top<=bottom){

            for(int i=left; i<=right; i++){
                matrix[top][i] = c++;
            }
            top++;

            for(int i=top; i<=bottom; i++){
                matrix[i][right] = c++;
            }
            right--;

            if(left<=right){
                for(int i=right; i>=left; i--){
                    matrix[bottom][i] = c++;
                }
                bottom--;
            }

            if(top<=bottom){
                for(int i=bottom; i>=top; i--){
                    matrix[i][left] = c++;
                }
                left++;
            }
        }

        return matrix;
        
    }
}
