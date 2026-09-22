/*
 * Problem: Nth Highest Salary
 * LeetCode: 177
 * Difficulty: Medium
 * Topics: SQL, Database
 *
 * Description:
 * Define a function that returns the nth distinct highest employee salary or null if it does not exist.
 *
 * Time Complexity: Depends on database execution plan
 * Space Complexity: Depends on database execution plan
 */
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET N = N-1;

  RETURN (
    SELECT DISTINCT salary FROM Employee ORDER BY salary DESC LIMIT 1 OFFSET N
  );
END
