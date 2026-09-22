/*
 * Problem: Not Boring Movies
 * LeetCode: 620
 * Difficulty: Easy
 * Topics: SQL, Filtering, Sorting
 *
 * Description:
 * Given cinema records, return odd-ID movies not described as boring, ordered by descending rating.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
SELECT id, movie, description, rating FROM Cinema WHERE id%2!=0 AND description!="boring" ORDER BY rating DESC;
