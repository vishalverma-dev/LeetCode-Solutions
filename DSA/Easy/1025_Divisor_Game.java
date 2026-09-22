/*
 * Problem: Divisor Game
 * LeetCode: 1025
 * Difficulty: Easy
 * Topics: Math, Dynamic Programming, Brainteaser, Game Theory
 *
 * Description:
 * Given n, determine whether Alice wins the divisor game when both players play optimally.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class Solution {
    public boolean divisorGame(int n) {
        return (n%2==0);
    }
}
