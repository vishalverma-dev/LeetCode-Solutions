/*
 * Problem: Find Missing and Repeated Values
 * LeetCode: 2965
 * Difficulty: Easy
 * Topics: Array, Hash Table, Math, Matrix
 *
 * Description:
 * Given an n x n grid containing numbers 1 through n² with one repeated and one missing value, return both values.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2)
 */
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n = grid.length;
        int n2 = n*n;
        int[] arr = new int[n2+1];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[grid[i][j]]++;
            }
        }

        int a = -1;
        int b = -1;
        for(int i=1; i<=n2; i++){
            if(arr[i]==2) a = i;
            else if (arr[i]==0) b = i;
        }
        return new int[] {a,b};

    }
}
