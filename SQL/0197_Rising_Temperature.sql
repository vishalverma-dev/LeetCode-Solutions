/*
 * Problem: Rising Temperature
 * LeetCode: 197
 * Difficulty: Easy
 * Topics: SQL, JOIN
 *
 * Description:
 * Given daily weather records, return IDs for dates warmer than the immediately previous date.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
# Write your MySQL query statement below
select w1.id from Weather w1 join Weather w2 on datediff(w1.recordDate, w2.recordDate) = 1 where w1.temperature>w2.temperature;
