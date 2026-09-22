/*
 * Problem: Second Highest Salary
 * LeetCode: 176
 * Difficulty: Medium
 * Topics: SQL, Database
 *
 * Description:
 * Given employee salaries, return the second distinct highest salary or null if it does not exist.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select (select distinct(salary) from Employee order by salary desc limit 1 offset 1) as SecondHighestSalary;
