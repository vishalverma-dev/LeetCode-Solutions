"""
Problem: Fix Names in a Table
LeetCode: 1667
Difficulty: Easy
Topics: Pandas, DataFrame

Description:
Given user records, capitalize each name correctly and return the records ordered by user ID.

Time Complexity: O(n log n)
Space Complexity: O(n)
"""
import pandas as pd

def fix_names(users: pd.DataFrame) -> pd.DataFrame:

    users["name"] = users["name"].str.capitalize()
    
    return users.sort_values(["user_id"])
    
