/*
 * Problem: Customer Placing the Largest Number of Orders
 * LeetCode: 586
 * Difficulty: Easy
 * Topics: SQL, Aggregation
 *
 * Description:
 * Given orders, return the customer number belonging to the customer with the most orders.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select customer_number from Orders group by customer_number order by count(order_number) desc limit 1;
