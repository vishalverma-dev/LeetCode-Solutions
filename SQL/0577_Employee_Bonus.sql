/*
 * Problem: Employee Bonus
 * LeetCode: 577
 * Difficulty: Easy
 * Topics: SQL, JOIN
 *
 * Description:
 * Given employee and bonus tables, return employees whose bonus is below 1000 or missing.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select name, bonus from Employee left join Bonus on Employee.empId = Bonus.empId where bonus<1000 or bonus is null;
