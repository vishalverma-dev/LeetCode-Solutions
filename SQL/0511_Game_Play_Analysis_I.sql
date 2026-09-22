/*
 * Problem: Game Play Analysis I
 * LeetCode: 511
 * Difficulty: Easy
 * Topics: SQL, Aggregation
 *
 * Description:
 * Given player activity, return each player ID and first login date.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select player_id, min(event_date) as 'first_login' from Activity group by player_id;
