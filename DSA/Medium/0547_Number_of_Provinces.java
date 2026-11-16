/*
 * Problem: Number of Provinces
 * LeetCode: 547
 * Difficulty: Medium
 * Topics: DFS, Graph, Connected Components
 *
 * Description:
 * Given an n x n matrix representing connections between cities,
 * find the total number of provinces. A province is a group of
 * directly or indirectly connected cities.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */

class Solution {

    static void dfs(int city, int[][] isConnected, boolean[] visited){
        visited[city] = true;
        int n = isConnected[city].length;
        for(int j=0; j<n; j++){
            if(isConnected[city][j] == 1 && !visited[j]){
                visited[j] = true;
                dfs(j, isConnected, visited);
            }
        }
    }


    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int province = 0;

        for(int i=0; i<n; i++){
            if(!visited[i]){
                province++;
                dfs(i, isConnected, visited);
            }
        }

        return province;
        
    }
}