/*
 * Problem: Time Needed to Buy Tickets
 * LeetCode: 2073
 * Difficulty: Easy
 * Topics: Array, Queue, Simulation
 *
 * Description:
 * Given a queue of people waiting to buy tickets, each person buys one ticket
 * at a time and moves to the back of the queue if they still need tickets.
 * Return the total time required for person k to finish buying all their tickets.
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(n)
 */


class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<tickets.length; i++){
            q.add(i);
        }

        int time = 0;

        while(true){

            int person = q.poll();

            tickets[person]--;
            time++;

            if(person==k && tickets[person]==0) break;

            if(tickets[person]>0){
                q.add(person);
            }
        }

        return time;       
    }
}