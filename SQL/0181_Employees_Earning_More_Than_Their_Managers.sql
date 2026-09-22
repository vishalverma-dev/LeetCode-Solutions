/*
 * Problem: Employees Earning More Than Their Managers
 * LeetCode: 181
 * Difficulty: Easy
 * Topics: SQL, JOIN
 *
 * Description:
 * Given employee records with manager references, return employees who earn more than their managers.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select e.name as Employee from Employee e join Employee m on e.managerId = m.id where e.salary>m.salary;
