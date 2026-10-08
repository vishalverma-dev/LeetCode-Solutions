/*
 * Problem: Reveal Cards In Increasing Order
 * LeetCode: 950
 * Difficulty: Medium
 * Topics: Array, Queue, Sorting, Simulation
 *
 * Description:
 * Given an integer array deck, return the ordering of the deck such that
 * revealing the top card and moving the next card to the bottom results
 * in the cards being revealed in increasing order.
 *
 * Approach:
 * Sort the deck and use a queue of indices to simulate the reveal process.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */


class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);
        int n = deck.length;

        int[] answer = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            q.add(i);
        }

        for(int card: deck){
            int index=q.remove();
            answer[index]=card;
            if(!q.isEmpty()){
                q.add(q.remove());
            }
        }

        return answer;
        
    }
}