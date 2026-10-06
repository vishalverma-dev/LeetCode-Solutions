/*
 * Problem: Find the Winner of the Circular Game
 * LeetCode: 1823
 * Difficulty: Medium
 * Topics: Array, Math, Simulation, Queue
 *
 * Description:
 * Given n friends in a circle and an integer k, eliminate every k-th friend
 * until only one friend remains. Return the winner of the game.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */


class Solution {
    public int findTheWinner(int n, int k) {

        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i<=n; i++){
            list.add(i);
        }

        int index = 0;

        while(list.size()>1){
            index = (index+k-1) % list.size();
            list.remove(index);
        }

        return list.peek();
        
    }
}