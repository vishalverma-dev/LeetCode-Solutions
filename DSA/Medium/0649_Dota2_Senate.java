/*
 * Problem: Dota2 Senate
 * LeetCode: 649
 * Difficulty: Medium
 * Topics: Queue, Greedy, Simulation
 *
 * Description:
 * Given a sequence of Radiant and Dire senators, each senator can ban another
 * senator's right to vote. Simulate the voting process and return the party
 * that will ultimately have the right to vote.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public String predictPartyVictory(String senate) {
        
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        int n = senate.length();

        for(int i=0; i<n; i++){
            if(senate.charAt(i)=='R') rad.add(i);
            else dire.add(i);
        }

        while(!rad.isEmpty() && !dire.isEmpty()){

            if(rad.peek()<dire.peek()){
                rad.add(n++);
            }else{
                dire.add(n++);
            }

            rad.poll();
            dire.poll();
        }

        if(!rad.isEmpty()) return "Radiant";
        return "Dire";


    }
}