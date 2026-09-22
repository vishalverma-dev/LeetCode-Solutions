/*
 * Problem: Biggest Single Number
 * LeetCode: 619
 * Difficulty: Easy
 * Topics: SQL, Aggregation
 *
 * Description:
 * Given numbers in a table, return the largest value that occurs exactly once or null.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below

select max(num) as num from MyNumbers where num in (select num from MyNumbers group by num having count(*)=1);
