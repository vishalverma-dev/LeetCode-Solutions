/*
 * Problem: Customers Who Never Order
 * LeetCode: 183
 * Difficulty: Easy
 * Topics: SQL, JOIN
 *
 * Description:
 * Given customers and orders, return the names of customers with no orders.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select name as Customers from Customers left join Orders on Customers.id = Orders.customerId where Orders.id is null;
