/*
 * Problem: Combine Two Tables
 * LeetCode: 175
 * Difficulty: Easy
 * Topics: SQL, JOIN
 *
 * Description:
 * Given person and address tables, return each person's name with city and state when an address exists.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select firstName, lastName, city, state from Person left join Address on Person.personID = Address.personID;
