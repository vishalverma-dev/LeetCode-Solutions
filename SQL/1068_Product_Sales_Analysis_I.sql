/*
 * Problem: Product Sales Analysis I
 * LeetCode: 1068
 * Difficulty: Easy
 * Topics: SQL, JOIN
 *
 * Description:
 * Given sales and product tables, return the product name, sale year, and price for every sale.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select product_name, year, price from Sales left join Product on Sales.product_id=Product.product_id;
