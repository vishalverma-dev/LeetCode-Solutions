/*
 * Problem: Kids With the Greatest Number of Candies
 * LeetCode: 1431
 * Difficulty: Easy
 * Topics: Array
 *
 * Description:
 * Given candies per child and extra candies, report which children can reach at least the current maximum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];

        for(int c: candies){
            max = Math.max(max,c);
        }

        for(int c: candies){
            if(c+extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        
        return ans;
    }
}
