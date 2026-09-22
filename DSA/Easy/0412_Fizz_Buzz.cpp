/*
 * Problem: Fizz Buzz
 * LeetCode: 412
 * Difficulty: Easy
 * Topics: Math, String, Simulation
 *
 * Description:
 * Given an integer n, return strings for 1 through n using Fizz, Buzz, or FizzBuzz for the required multiples.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> result;
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0) result.push_back("FizzBuzz");
            else if(i%3==0) result.push_back("Fizz");
            else if(i%5==0) result.push_back("Buzz");
            else result.push_back(to_string(i));
        }
        return result;
    }
};
