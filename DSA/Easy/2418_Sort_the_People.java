/*
 * Problem: Sort the People
 * LeetCode: 2418
 * Difficulty: Easy
 * Topics: Array, Hash Table, Sorting
 *
 * Description:
 * Given names and distinct heights, return the names sorted by height in descending order.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        for(int i=0; i<heights.length-1; i++){
            for(int j=0; j<heights.length-1-i; j++){
                if(heights[j]<heights[j+1]){
                    int temp = heights[j];
                    String nameTemp = names[j];
                    heights[j] = heights[j+1];
                    names[j] = names[j+1];
                    heights[j+1] = temp;
                    names[j+1] = nameTemp;
                }
            }
        }
        
        return names;


    }
}
