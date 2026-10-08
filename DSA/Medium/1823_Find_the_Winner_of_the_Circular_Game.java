/*
 * Problem: Find the Winner of the Circular Game
 * LeetCode: 1823
 * Difficulty: Medium
 * Topics: Array, Math, Simulation, Queue
 *
 * Description:
 * Given n friends in a circle and an integer k, eliminate every k-th friend
 * until only one friend remains. Return the winner.
 *
 * Approach:
 * Use a Queue to simulate the circular elimination process.
 * Move k-1 friends to the back of the queue, then remove the k-th friend.
 *
 * Time Complexity: O(n * k)
 * Space Complexity: O(n)
 */

class Solution {
    public int findTheWinner(int n, int k) {

        int winner = 0;

        for(int i=2; i<=n; i++){
            winner = (winner+k)%i;
        }

        return winner+1;
        
    }
}