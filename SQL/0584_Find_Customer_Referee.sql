/*
 * Problem: Find Customer Referee
 * LeetCode: 584
 * Difficulty: Easy
 * Topics: SQL, Filtering
 *
 * Description:
 * Given customer records, return names of customers not referred by customer 2.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select name from Customer where referee_id!=2 or referee_id is NULL;
