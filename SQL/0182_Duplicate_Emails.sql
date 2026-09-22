/*
 * Problem: Duplicate Emails
 * LeetCode: 182
 * Difficulty: Easy
 * Topics: SQL, Aggregation
 *
 * Description:
 * Given a person table, return every email address that appears more than once.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select email as Email from Person group by email having count(*)>1;
