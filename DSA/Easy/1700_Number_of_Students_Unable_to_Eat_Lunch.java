/*
 * Problem: Number of Students Unable to Eat Lunch
 * LeetCode: 1700
 * Difficulty: Easy
 * Topics: Array, Queue, Simulation
 *
 * Description:
 * Given students in a queue and sandwiches in a stack, simulate the process of
 * students taking their preferred sandwich or moving to the end of the queue.
 * Return the number of students who are unable to eat.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */


class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q= new LinkedList<>();
        for(int student: students){
            q.add(student);
        }

        int sI = 0;
        int rot = 0;
        while(!q.isEmpty() && rot<q.size()){
            if(q.peek()==sandwiches[sI]){
                q.poll();
                sI++;
                rot = 0;
            }
            else{
                q.add(q.poll());
                rot++;
            }
        }
        
        return q.size();
    
    }

}