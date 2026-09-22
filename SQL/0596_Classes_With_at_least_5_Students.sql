/*
 * Problem: Classes With at Least 5 Students
 * LeetCode: 596
 * Difficulty: Easy
 * Topics: SQL, Aggregation
 *
 * Description:
 * Given course enrollment records, return classes with at least five students.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select class from Courses group by class having count(student)>=5;
