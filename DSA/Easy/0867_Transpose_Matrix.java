/*
 * Problem: Transpose Matrix
 * LeetCode: 867
 * Difficulty: Easy
 * Topics: Array, Matrix, Simulation
 *
 * Description:
 * Given a matrix, return its transpose by swapping rows and columns.
 *
 * Time Complexity: O(mn)
 * Space Complexity: O(mn)
 */
class Solution {
    public int[][] transpose(int[][] matrix) {

        int[][] trans = new int[matrix[0].length][matrix.length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                trans[j][i] = matrix[i][j];
            }
        }

        return trans;
        
    }
}
