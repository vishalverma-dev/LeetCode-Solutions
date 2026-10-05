/*
 * Problem: Recent Counter
 * LeetCode: 933
 * Difficulty: Easy
 * Topics: Queue, Design, Data Stream
 *
 * Description:
 * Given a stream of ping requests, return the number of requests that have
 * been made in the last 3000 milliseconds, including the current request.
 *
 * Time Complexity: O(1) amortized
 * Space Complexity: O(n)
 */

class RecentCounter {

    Queue<Integer> q;

    public RecentCounter() {

        q = new LinkedList<>();
    }
    
    public int ping(int t) {

        q.add(t);
        while(q.peek()<t-3000){
            q.poll();
        }
        return q.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */