/*
 * Problem: Flood Fill
 * LeetCode: 733
 * Difficulty: Easy
 * Topics: DFS, Graph, Matrix, Recursion
 *
 * Description:
 * Given an image represented by an m x n integer matrix, a starting
 * pixel (sr, sc), and a new color, perform a flood fill operation.
 * Change the color of the starting pixel and all 4-directionally
 * connected pixels having the same original color to the new color.
 *
 * Time Complexity: O(m * n)
 * Space Complexity: O(m * n)
 */


class Solution {


    public static void dfs(int row, int col, int[][] image, int ogColor, int color){

        int rows = image.length;
        int cols = image[0].length;

        if(row>=0 && row<rows && col>=0 && col<cols && image[row][col]==ogColor){

            image[row][col] = color;

            dfs(row-1, col, image,ogColor, color);
            dfs(row+1, col, image,ogColor, color);
            dfs(row, col-1, image,ogColor, color);
            dfs(row, col+1, image,ogColor, color);

        }

    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc]==color){
            return image;
        }

        int ogColor = image[sr][sc];

        dfs(sr, sc, image, ogColor, color);

        return image;
        
    }
}